package org.fluiddata.client.model;

import java.util.ArrayList;
import java.util.List;

/**
 * An item that can contain other items
 * 
 * @author samyem
 * 
 */
public class Folder extends Item {
    private List<Item> items = new ArrayList<Item>();

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
