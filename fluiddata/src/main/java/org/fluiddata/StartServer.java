package org.fluiddata;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;


public class StartServer {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setWar("web");
        server.setHandler(webapp);
        
        
        server.start();
        server.join();
    }
}
