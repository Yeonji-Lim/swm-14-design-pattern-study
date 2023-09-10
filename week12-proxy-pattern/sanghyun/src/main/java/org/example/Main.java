package org.example;

import org.example.db.MySQLProxy;
import org.example.entity.User;

public class Main {
    public static void main(String[] args) {
        MySQLProxy mySQLProxy = new MySQLProxy();

        System.out.println("==================== Transaction start!!! ====================");

        // 1개의 데이터 4회 insert
        User 상현 = User.create("상현");
        mySQLProxy.insert(상현);

        User 도연 = User.create("도연");
        mySQLProxy.insert(도연);

        User 하은 = User.create("하은");
        mySQLProxy.insert(하은);

        User 연지 = User.create("연지");
        mySQLProxy.insert(연지);

        System.out.println("==================== Transaction end!!!!! ====================");
        // Transaction
        mySQLProxy.done();

    }
}