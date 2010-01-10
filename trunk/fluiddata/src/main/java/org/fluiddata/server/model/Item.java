package org.fluiddata.server.model;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Base atomic content
 * 
 * @author samyem
 * 
 */
public class Item {
    private BigInteger id;
    private Map<String, Object> properties = new HashMap<String, Object>(0);

    /**
     * Custom properties
     * 
     * @return
     */
    public Map<String, Object> getProperties() {
        return properties;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    private String name;

    private Date created;
    private Date modified;
}
