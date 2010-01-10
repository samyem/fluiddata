package org.fluiddata.server.model;

import java.io.Serializable;

/**
 * A physical workspace that will be used as the root container
 * 
 * @author samyem
 * 
 */
public class Workspace implements Serializable {
    private static final long serialVersionUID = 1L;
    private String directory;
    private String name;
    private String description;

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
