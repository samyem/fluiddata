package org.fluiddata.server;

import org.fluiddata.client.RPCService;
import org.fluiddata.client.model.Folder;
import org.fluiddata.server.service.ContainerManager;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class RPCServiceImpl extends RemoteServiceServlet implements RPCService {
    private static final long serialVersionUID = 1L;

    public String nothing(String in) {
        return "out " + in;
    }

    public Folder getRootFolder(String base) {
        return getContext().getBean(ContainerManager.class).getRootFolder(base);
    }

    private ApplicationContext getContext() {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        return context;
    }
}
