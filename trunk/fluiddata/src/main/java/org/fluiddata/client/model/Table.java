package org.fluiddata.client.model;

import java.util.ArrayList;
import java.util.List;

/**
 * A table containing rows and columns
 * 
 * @author samyem
 * 
 */
public class Table extends Folder {
    private List<TableColumn> columns = new ArrayList<TableColumn>(0);
    private List<TableRow> rows = new ArrayList<TableRow>(0);

    public List<TableRow> getRows() {
        return rows;
    }

    public void setRows(List<TableRow> rows) {
        this.rows = rows;
    }

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
