public class TextApplication extends Application {
    @Override
    public Document createDocument(String type) {
        Document document = null;
        if(type.equals("normal"))
            document = new NormalTextDocument();
        else if(type.equals("fancy"))
            document = new FancyTextDocument();
        return document;
    }
}
