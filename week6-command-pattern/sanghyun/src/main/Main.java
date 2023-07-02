package main;

import main.command.Command;
import main.command.DataBaseCommand;
import main.database.MongoDB;
import main.database.MySQL;
import main.database.Redis;

import static main.Type.*;

public class Main {
    public static void main(String[] args) {
        DBMS dbms = new DBMS();

        Command mysqlCommand = new DataBaseCommand(new MySQL());
        Command mongoCommand = new DataBaseCommand(new MongoDB());
        Command redisCommand = new DataBaseCommand(new Redis());


        dbms.setDBMSType(MYSQL, mysqlCommand);
        dbms.setDBMSType(MONGODB, mongoCommand);
        dbms.setDBMSType(REDIS, redisCommand);

        System.out.println("================ MYSQL ================");
        dbms.savingProcess(MYSQL);
        System.out.println("================ MONGO ================");
        dbms.savingProcess(MONGODB);
        System.out.println("================ REDIS ================");
        dbms.savingProcess(REDIS);
    }
}
