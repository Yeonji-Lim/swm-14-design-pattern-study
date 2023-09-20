package org.example.db;

import org.example.entity.User;

import java.util.ArrayList;
import java.util.List;

public class MySQLProxy implements Database {

    private static final List<User> database = new ArrayList<>();
    private MySQL mySQL = new MySQL();

    @Override
    public void insert(Object... objects) {
        for (Object object : objects) {
            User user = (User) object;
            database.add(user);
        }
    }

    public void done() {
        mySQL.insert(database.toArray());
    }
}
