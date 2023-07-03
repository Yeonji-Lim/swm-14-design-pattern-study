package main.database;

public class Redis implements DataBase{
    @Override
    public void connect() {
        System.out.println("[   connect  ] success connect Redis");
    }

    @Override
    public void save() {
        System.out.println("[    save    ] set {key} {value}");
    }

    @Override
    public void disconnect() {
        System.out.println("[ disconnect ] success disconnect Redis");
    }
}
