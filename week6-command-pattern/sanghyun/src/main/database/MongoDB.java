package main.database;

public class MongoDB implements DataBase {
    @Override
    public void connect() {
        System.out.println("[   connect  ] success connect MongoDB");
    }

    @Override
    public void save() {
        System.out.println("[    save    ] {DB}.{COLLECTION}.insert({DATA})");
    }

    @Override
    public void disconnect() {
        System.out.println("[ disconnect ] success disconnect MongoDB");
    }
}
