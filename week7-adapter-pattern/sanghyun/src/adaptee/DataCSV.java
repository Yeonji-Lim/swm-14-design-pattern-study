package adaptee;

public class DataCSV implements Data {
    // CSV
    @Override
    public String getData() {
        return "name,author\n" +
                "Head First Design Pattern,서환수";
    }
}
