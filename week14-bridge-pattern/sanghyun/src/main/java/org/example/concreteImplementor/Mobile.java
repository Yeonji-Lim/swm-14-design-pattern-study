package org.example.concreteImplementor;

import org.example.implementor.Client;

public class Mobile implements Client {
    @Override
    public String request() {
        return "Mobile";
    }
}
