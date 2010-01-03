package org.fluiddata.server;

import org.fluiddata.client.MyService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class MyServiceImpl extends RemoteServiceServlet implements MyService {
    public String nothing(String in){
        return "out "+in;
    }
}
