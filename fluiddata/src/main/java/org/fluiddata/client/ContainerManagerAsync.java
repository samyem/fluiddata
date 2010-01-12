package org.fluiddata.client;

import java.util.List;

import org.fluiddata.client.model.Configuration;
import org.fluiddata.client.model.Folder;
import org.fluiddata.client.model.Item;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ContainerManagerAsync {
    public void getRootFolder(String base, AsyncCallback<Folder> callback);

    public void getConfiguration( AsyncCallback<Configuration> callback);

    public void addWorkspace(String name, String path, AsyncCallback<Void> callback);

    public void getItems(String base, String path,AsyncCallback<List<Item>> callback);
}
