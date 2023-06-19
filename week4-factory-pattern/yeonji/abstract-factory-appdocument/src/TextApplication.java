public class TextApplication extends Application {
    @Override
    public Document createDocument(String type) {
        Document document = null;
        DocumentInfoFactory documentInfoFactory = new TextDocumentInfoFactory();
        if(type.equals("normal"))
            document = new NormalTextDocument(documentInfoFactory);
        else if(type.equals("fancy"))
            document = new FancyTextDocument(documentInfoFactory);
        return document;
    }
}
