package org.fluiddata.server.service.impl;

import java.util.List;

import org.fluiddata.server.model.Configuration;
import org.fluiddata.server.model.Workspace;
import org.fluiddata.server.service.ContainerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class ContainerManagerImplTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private ContainerManager containerManager;

    @Test
    public void testGetConfiguration() {
        Configuration configuration = containerManager.getConfiguration();
        Assert.assertNotNull(configuration);

        containerManager.addWorkspace("default", "C:\\fluidData");
        configuration = containerManager.getConfiguration();

        List<Workspace> workspace = configuration.getWorkspace();
        Assert.assertTrue(workspace.size() > 0);

    }
}
