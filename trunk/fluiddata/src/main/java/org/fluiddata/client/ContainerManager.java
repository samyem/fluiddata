package org.fluiddata.client;

import java.util.List;

import org.fluiddata.client.model.Configuration;
import org.fluiddata.client.model.Folder;
import org.fluiddata.client.model.Item;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/containerManager")
public interface ContainerManager extends RemoteService {
    public Folder getRootFolder(String base);

    public Configuration getConfiguration();

    public void addWorkspace(String name, String path);

    public List<Item> getItems(String base, String path);
}
