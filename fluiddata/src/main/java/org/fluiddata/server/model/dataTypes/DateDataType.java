package org.fluiddata.server.model.dataTypes;

import java.sql.Types;

import org.fluiddata.client.model.DataType;

public class DateDataType implements DataType {

    @Override
    public String getDisplayName() {
        return "Date";
    }

    @Override
    public String getName() {
        return "Date";
    }

    @Override
    public int getSQLType() {
        return Types.DATE;
    }

}
