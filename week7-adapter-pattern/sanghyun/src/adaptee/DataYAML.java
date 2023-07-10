package adaptee;

public class DataYAML implements Data {

    @Override
    public String getData() {
        return "name: About Time\n" +
                "actor: Rachel";
    }
}
