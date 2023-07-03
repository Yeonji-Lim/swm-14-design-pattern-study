package main;

import main.command.Command;

import java.util.HashMap;

public class DBMS {

    HashMap<Type, Command> DBMSType = new HashMap<>();

    public void setDBMSType(Type type, Command command) {
        DBMSType.put(type, command);
    }

    public void savingProcess(Type type) {
        DBMSType.get(type).execute();
    }

}
