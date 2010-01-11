package org.fluiddata.server.model.dataTypes;

import java.sql.Types;

import org.fluiddata.client.model.DataType;

public class IntegerDataType implements DataType {

    @Override
    public String getDisplayName() {
        return "Integer number";
    }

    @Override
    public String getName() {
        return "Integer";
    }

    @Override
    public int getSQLType() {
        return Types.INTEGER;
    }

}
