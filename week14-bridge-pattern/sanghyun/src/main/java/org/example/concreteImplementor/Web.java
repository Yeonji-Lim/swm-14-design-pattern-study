package org.example.concreteImplementor;

import org.example.implementor.Client;

public class Web implements Client {
    @Override
    public String request() {
        return "Web";
    }
}
