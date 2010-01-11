package org.fluiddata.client;

import org.fluiddata.client.model.Folder;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface RPCServiceAsync {

    void nothing(String in, AsyncCallback<String> callback);

    void getRootFolder(String base, AsyncCallback<Folder> callback);

}
