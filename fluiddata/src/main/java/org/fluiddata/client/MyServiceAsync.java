package org.fluiddata.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MyServiceAsync {

    void nothing(String in, AsyncCallback<String> callback);

}
