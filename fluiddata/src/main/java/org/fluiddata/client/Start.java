package org.fluiddata.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class Start implements EntryPoint {
    ContainerManagerAsync service = GWT.create(ContainerManager.class);

    public void onModuleLoad() {
        final Button sendButton = new Button("Send");

        // RootPanel.get("here").add(sendButton);

        MainPage page = new MainPage("firstName");
        RootPanel.get("here").add(page);

        sendButton.addClickHandler(new ClickHandler() {

            public void onClick(ClickEvent event) {
                Window.alert("hello world");
            }
        });

    }

}
