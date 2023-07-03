package main.command;

import main.database.DataBase;

public class DataBaseCommand implements Command{

    DataBase dataBase;

    public DataBaseCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.connect();
        dataBase.save();
        dataBase.disconnect();
    }
}
