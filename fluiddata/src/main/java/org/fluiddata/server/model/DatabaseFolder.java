package org.fluiddata.server.model;

import java.util.HashSet;
import java.util.Set;

public class DatabaseFolder extends Folder {
    private Set<Table> tables = new HashSet<Table>(0);

    public Set<Table> getTables() {
        return tables;
    }
}
