package org.example;

import org.example.concreteImplementor.Mobile;
import org.example.concreteImplementor.Web;
import org.example.refinedAbstraction.Node;
import org.example.refinedAbstraction.Spring;

public class Main {
    public static void main(String[] args) {
        Spring webSpring = new Spring(new Web());
        String webSpringRes = webSpring.response();
        System.out.println(webSpringRes);

        Spring mobileSpring = new Spring(new Mobile());
        String mobileSpringRes = mobileSpring.response();
        System.out.println(mobileSpringRes);

        Node webNode = new Node(new Web());
        String webNodeRes = webNode.response();
        System.out.println(webNodeRes);

        Node mobileNode = new Node(new Mobile());
        String mobileNodeRes = mobileNode.response();
        System.out.println(mobileNodeRes);

    }
}