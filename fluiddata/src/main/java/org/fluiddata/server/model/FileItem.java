package org.fluiddata.server.model;

import java.io.File;

/**
 * Item backed by a file
 * @author samyem
 *
 */
public class FileItem extends Item {
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
