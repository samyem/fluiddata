package org.fluiddata.server.service.impl;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.fluiddata.client.model.Configuration;
import org.fluiddata.client.model.Folder;
import org.fluiddata.client.model.Workspace;
import org.fluiddata.server.service.ContainerManager;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * Metadata contains XML to decribe
 * 
 * @author samyem
 * 
 */
@Service
public class ContainerManagerImpl implements ContainerManager, InitializingBean {
    private String homeDir;
    private File fluidDataConfig;
    private File configFile;

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

        if (!configFile.isFile()) {
            config = new Configuration();
            writeConfig(config);
        } else {
            FileInputStream in;
            try {
                in = new FileInputStream(configFile);
                XMLDecoder decoder = new XMLDecoder(in);
                config = (Configuration) decoder.readObject();
                decoder.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return config;
    }

    private void writeConfig(Configuration config) {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(configFile);

            XMLEncoder xenc = new XMLEncoder(fos);
            xenc.writeObject(config);
            xenc.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addWorkspace(String name, String path) {
        Workspace workspace = new Workspace();
        workspace.setName(name);
        workspace.setDirectory(path);

        Configuration configuration = getConfiguration();
        configuration.getWorkspace().add(workspace);

        writeConfig(configuration);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        homeDir = System.getProperty("user.home");
        fluidDataConfig = new File(homeDir, "fluiddata");
        if (!fluidDataConfig.isDirectory()) {
            fluidDataConfig.mkdir();
        }
        configFile = new File(fluidDataConfig, "configuration.xml");

    }

}
