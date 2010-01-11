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
    RPCServiceAsync service = GWT.create(RPCService.class);

    public void onModuleLoad() {
        final Button sendButton = new Button("Send");

        // RootPanel.get("here").add(sendButton);

        MainPage page = new MainPage("firstName");
        RootPanel.get("here").add(page);

        sendButton.addClickHandler(new ClickHandler() {

            public void onClick(ClickEvent event) {
                Window.alert("hello world");

                service.nothing("hello", new AsyncCallback<String>() {

                    @Override
                    public void onSuccess(String result) {
                        Window.alert("hello world " + result);
                    }

                    @Override
                    public void onFailure(Throwable caught) {

                    }
                });
            }
        });

    }

}
