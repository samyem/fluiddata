package org.fluiddata.client.model;

import java.io.Serializable;
import java.util.List;

/**
 * A row in a table
 * 
 * @author samyem
 * 
 */
public class TableRow implements Serializable {
    private static final long serialVersionUID = 1L;
    private Table table;
    private Integer row;
    private List<TableCell> cells;

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public List<TableCell> getCells() {
        return cells;
    }

    public void setCells(List<TableCell> cells) {
        this.cells = cells;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

}
