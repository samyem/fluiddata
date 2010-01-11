package org.fluiddata.server.model.dataTypes;

import java.sql.Types;

import org.fluiddata.client.model.DataType;

public class BooleanDataType implements DataType {

    @Override
    public String getDisplayName() {
        return "Yes/No";
    }

    @Override
    public String getName() {
        return "Boolean";
    }

    @Override
    public int getSQLType() {
        return Types.BOOLEAN;
    }

}
