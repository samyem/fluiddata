package org.fluiddata.server.service;

import org.fluiddata.client.model.Configuration;
import org.fluiddata.client.model.Folder;

public interface ContainerManager {
    public Folder getRootFolder(String base);

    public Configuration getConfiguration();

    public void addWorkspace(String name, String path);
}
