package main.database;

public class MySQL implements DataBase{
    @Override
    public void connect() {
        System.out.println("[   connect  ] success connect MySQL");
    }

    @Override
    public void save() {
        System.out.println("[    save    ] INSERT INTO {TABLE} VALUES {DATA}");
    }

    @Override
    public void disconnect() {
        System.out.println("[ disconnect ] success disconnect MySQL");
    }
}
