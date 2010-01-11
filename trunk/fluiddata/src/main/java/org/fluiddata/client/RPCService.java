package org.fluiddata.client;

import org.fluiddata.client.model.Folder;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("rpc")
public interface RPCService extends RemoteService {
    public String nothing(String in);

    public Folder getRootFolder(String base);
}
