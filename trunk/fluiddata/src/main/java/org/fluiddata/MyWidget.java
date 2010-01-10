/**
 * 
 */
package org.fluiddata;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author samyem
 *
 */
public class MyWidget extends Composite {

    private static MyWidgetUiBinder uiBinder = GWT.create(MyWidgetUiBinder.class);

    interface MyWidgetUiBinder extends UiBinder<Widget, MyWidget> {
    }

    @UiField
    Button button;

    public MyWidget(String firstName) {
        initWidget(uiBinder.createAndBindUi(this));

        // Can access @UiField after calling createAndBindUi
        button.setText(firstName);
    }

    @UiHandler("button")
    void onClick(ClickEvent e) {
        Window.alert("Hello!");
    }

}
