package org.fluiddata.server.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Configuration implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Workspace> workspace = new ArrayList<Workspace>(0);

    public List<Workspace> getWorkspace() {
        return workspace;
    }

    public void setWorkspace(List<Workspace> workspace) {
        this.workspace = workspace;
    }

}
