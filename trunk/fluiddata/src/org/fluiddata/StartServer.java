package org.fluiddata;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.xml.XmlConfiguration;

public class StartServer {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Server server = new Server();

        XmlConfiguration configuration = new XmlConfiguration(StartServer.class.getResource("/jetty.xml"));
        configuration.configure(server);
        server.start();
    }

}
