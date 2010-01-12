/**
 * 
 */
package org.fluiddata.client;

import org.fluiddata.client.model.Folder;

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
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author samyem
 * 
 */
public class MainPage extends Composite {
    private static final String loadingIndicator="_L";
    private RPCServiceAsync service = GWT.create(RPCService.class);
    private ContainerManagerAsync containerManager = GWT.create(ContainerManager.class);

    private static MainPageUiBinder uiBinder = GWT.create(MainPageUiBinder.class);

    interface MainPageUiBinder extends UiBinder<Widget, MainPage> {
    }

    @UiField
    Button button;
    @UiField
    TextBox baseFolder;
    @UiField
    Label label;
    
    @UiField
    Tree tree;
    
    public MainPage(String firstName) {
        initWidget(uiBinder.createAndBindUi(this));

        // Can access @UiField after calling createAndBindUi
        button.setText(firstName);

        tree.addOpenHandler(new OpenHandler<TreeItem>() {
            
            @Override
            public void onOpen(OpenEvent<TreeItem> event) {
                Window.alert("Tree opened");
                
                TreeItem target = event.getTarget();
                
                //is it loaded yet?
                if(target.getChildCount()==1 && target.getChild(0).getUserObject().equals(loadingIndicator)){
                    Window.alert("Need to load");                    
                }
            }
        });
        
    }

    @UiHandler("button")
    void onClick(ClickEvent e) {
        containerManager.getRootFolder(baseFolder.getText(), new AsyncCallback<Folder>() {
            
            @Override
            public void onSuccess(Folder result) {
                label.setText(result.getName());
                
                
                TreeItem item=new TreeItem(result.getName());

                TreeItem loadingItem=new TreeItem("Loading...");
                loadingItem.setUserObject(loadingIndicator);
                
                item.addItem(loadingItem);
                
                tree.addItem(item);
            }
            
            @Override
            public void onFailure(Throwable caught) {
                Window.alert("error"+caught);
            }
        });
    }

}
