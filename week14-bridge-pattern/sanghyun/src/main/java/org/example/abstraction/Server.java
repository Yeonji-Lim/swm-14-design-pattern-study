package org.example.abstraction;

import org.example.implementor.Client;

public abstract class Server {
    protected final Client client;

    public Server(Client client) {
        this.client = client;
    }

    public abstract String response();
}
