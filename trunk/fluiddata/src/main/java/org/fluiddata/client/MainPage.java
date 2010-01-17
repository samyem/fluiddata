/**
 * 
 */
package org.fluiddata.client;

import java.util.List;

import org.fluiddata.client.model.Folder;
import org.fluiddata.client.model.Item;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.OpenEvent;
import com.google.gwt.event.logical.shared.OpenHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author samyem
 * 
 */
public class MainPage extends Composite {
    private static final String loadingIndicator = "_L";
    private ContainerManagerAsync containerManager = GWT.create(ContainerManager.class);

    private static MainPageUiBinder uiBinder = GWT.create(MainPageUiBinder.class);

    interface MainPageUiBinder extends UiBinder<Widget, MainPage> {
    }

    @UiField
    Button button;
    @UiField
    TextBox baseFolder;

    @UiField
    Tree tree;

    private String base;

    public MainPage(String firstName) {
        initWidget(uiBinder.createAndBindUi(this));
        tree.addOpenHandler(new OpenHandler<TreeItem>() {

            @Override
            public void onOpen(OpenEvent<TreeItem> event) {
                final TreeItem target = event.getTarget();

                // is it loaded yet?
                if (target.getChildCount() == 1 && target.getChild(0).getUserObject().equals(loadingIndicator)) {
                    Folder userObject = (Folder) target.getUserObject();
                    containerManager.getItems(base, userObject.getPath(), new AsyncCallback<List<Item>>() {

                        @Override
                        public void onSuccess(List<Item> result) {
                            target.removeItems();

                            for (Item item : result) {
                                if (item instanceof Folder) {
                                    addFolder((Folder) item, target);
                                } else {
                                    TreeItem treeItem = new TreeItem(item.getName());
                                    treeItem.setUserObject(item);
                                    target.addItem(treeItem);
                                }
                            }
                        }

                        @Override
                        public void onFailure(Throwable caught) {
                            Window.alert("Error:" + caught.getMessage());
                        }
                    });

                }
            }
        });

    }

    @UiHandler("button")
    void onClick(ClickEvent e) {
        base = baseFolder.getText();

        containerManager.getRootFolder(base, new AsyncCallback<Folder>() {

            @Override
            public void onSuccess(Folder result) {
                addFolder(result, null);
            }

            @Override
            public void onFailure(Throwable caught) {
                Window.alert("error" + caught);
            }
        });
    }

    private void addFolder(Folder folder, TreeItem target) {
        TreeItem item = new TreeItem(folder.getName());
        item.setUserObject(folder);

        TreeItem loadingItem = new TreeItem("Loading...");
        loadingItem.setUserObject(loadingIndicator);

        item.addItem(loadingItem);

        if (target == null)
            tree.addItem(item);
        else
            target.addItem(item);
    }

}
