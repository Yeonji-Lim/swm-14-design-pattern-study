package org.example.refinedAbstraction;

import org.example.abstraction.Server;
import org.example.implementor.Client;

public class Node extends Server {

    private static final String 기능 = "매칭";
    private static final String URI = "https://api.jari-bean.com/matching";

    public Node(Client client) {
        super(client);
    }

    @Override
    public String response() {
        return createURL();
    }

    private String createURL() {
        return "[" + 기능 + "] [" + client.request() + "] " + URI;
    }
}
