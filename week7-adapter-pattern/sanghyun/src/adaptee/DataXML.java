package adaptee;

public class DataXML implements Data {

    // XML
    @Override
    public String getData() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<album>\n" +
                "  <name>Made</name>\n" +
                "  <artist>BIGBANG</artist>\n" +
                "</album>";
    }
}
