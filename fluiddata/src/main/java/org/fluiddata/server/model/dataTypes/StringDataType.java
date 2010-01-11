package org.fluiddata.server.model.dataTypes;

import java.sql.Types;

import org.fluiddata.client.model.DataType;

public class StringDataType implements DataType {

    @Override
    public String getDisplayName() {
        return "String";
    }

    @Override
    public String getName() {
        return "string";
    }

    @Override
    public int getSQLType() {
        return Types.VARCHAR;
    }
}
