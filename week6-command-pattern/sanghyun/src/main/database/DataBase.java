package main.database;

public interface DataBase {
    void connect();
    void save();
    void disconnect();
}
