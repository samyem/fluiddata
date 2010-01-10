package org.fluiddata.server.service.impl;

import java.io.File;

import org.fluiddata.server.model.Configuration;
import org.fluiddata.server.model.Folder;
import org.fluiddata.server.service.ContainerManager;
import org.springframework.stereotype.Service;

/**
 * Metadata contains XML to decribe
 * 
 * @author samyem
 * 
 */
@Service
public class ContainerManagerImpl implements ContainerManager {
    // The base physical folder which will be decorated with meta data
    public Folder getRootFolder(String base) {
        File baseFile = new File(base);
        if (!baseFile.isDirectory()) {
            baseFile.mkdirs();
        }

        Folder folder = new Folder();
        folder.setName(baseFile.getName());
        return folder;
    }

    public Configuration getConfiguration() {
        Configuration config = null;

        // read in from the user's config file
        String homeDir = System.getProperty("user.home");
        File fluidDataConfig = new File(homeDir, "fluiddata");
        if (!fluidDataConfig.isDirectory()) {
            fluidDataConfig.mkdir();
        }
        File configFile=new File("configuration.xml");
        if(!configFile.isFile()){
            config=new Configuration();
            
        }
        
        

        return config;
    }

}
