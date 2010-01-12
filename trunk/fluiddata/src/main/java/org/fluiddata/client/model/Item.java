package org.fluiddata.client.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Base atomic content
 * 
 * @author samyem
 * 
 */
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    private Folder container;
    private Integer id;
    private String path;
    private Map<String, Object> properties = new HashMap<String, Object>(0);

    /**
     * Custom properties
     * 
     * @return
     */
    public Map<String, Object> getProperties() {
        return properties;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Folder getContainer() {
        return container;
    }

    public void setContainer(Folder container) {
        this.container = container;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
