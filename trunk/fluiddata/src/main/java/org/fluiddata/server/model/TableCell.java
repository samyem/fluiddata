package org.fluiddata.server.model;

/**
 * A cell of a table that holds the data
 * 
 * @author samyem
 * 
 */
public class TableCell {
    private Table table;
    private TableColumn column;
    private TableRow row;

    private Object value;

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public TableColumn getColumn() {
        return column;
    }

    public void setColumn(TableColumn column) {
        this.column = column;
    }

    public TableRow getRow() {
        return row;
    }

    public void setRow(TableRow row) {
        this.row = row;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
