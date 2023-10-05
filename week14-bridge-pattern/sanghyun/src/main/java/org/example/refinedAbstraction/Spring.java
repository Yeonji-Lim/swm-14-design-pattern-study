package org.example.refinedAbstraction;

import org.example.abstraction.Server;
import org.example.implementor.Client;

public class Spring extends Server {

    private static final String 기능 = "예약";
    private static final String URI = "https://api.jari-bean.com/reserving";

    public Spring(Client client) {
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
