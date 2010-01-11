package org.fluiddata.client.model;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author samyem
 * 
 */
public class Database extends Folder {
    private static final long serialVersionUID = 1L;
    private Set<Table> tables = new HashSet<Table>(0);

    public Set<Table> getTables() {
        return tables;
    }
}
