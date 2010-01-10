package org.fluiddata.server.model;

/**
 * Column of a table
 * 
 * @author samyem
 * 
 */
public class TableColumn extends Item {
    private Table table;
    private DataType dataType;
    private int size;

    private boolean isPrimaryKey = false;
    private boolean isIndexed = false;

    private TableColumn referenceColumn;

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    /**
     * Foreign key reference
     * 
     * @return
     */
    public TableColumn getReferenceColumn() {
        return referenceColumn;
    }

    public void setReferenceColumn(TableColumn referenceColumn) {
        this.referenceColumn = referenceColumn;
    }

    public boolean isPrimaryKey() {
        return isPrimaryKey;
    }

    public void setPrimaryKey(boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }

    public boolean isIndexed() {
        return isIndexed;
    }

    public void setIndexed(boolean isIndexed) {
        this.isIndexed = isIndexed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
