package org.fluiddata.server.model;

import java.util.ArrayList;
import java.util.List;

public class Table extends Folder {
    private List<TableColumn> columns = new ArrayList<TableColumn>(0);

    public List<TableColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<TableColumn> columns) {
        this.columns = columns;
    }

    public Integer getRowCount() {
        return null;
    }
    
    

}
