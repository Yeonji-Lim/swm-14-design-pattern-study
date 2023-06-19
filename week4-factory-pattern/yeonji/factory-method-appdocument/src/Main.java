public class Main {
    public static void main(String[] args) {
        Application app1 = new TextApplication();
        app1.newDocument("normal");
        app1.newDocument("fancy");

        Application app2 = new PaintApplication();
        app2.newDocument("normal");
        app2.newDocument("fancy");
    }
}
