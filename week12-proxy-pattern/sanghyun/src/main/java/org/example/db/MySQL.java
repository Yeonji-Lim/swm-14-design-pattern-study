package org.example.db;

import org.example.entity.User;

import java.util.HashMap;
import java.util.Map;

public class MySQL implements Database {

    private static final Map<Long, User> database = new HashMap<>();
    private static Long primaryKey = 0L;

    @Override
    public void insert(Object... objects) {
        for (Object object : objects) {
            User user = (User) object;
            database.put(primaryKey++, user);
        }
        System.out.println("mysql insert 작업 완료");
    }
}
