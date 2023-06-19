public class PaintApplication extends Application {
    @Override
    public Document createDocument(String type) {
        Document document = null;
        DocumentInfoFactory documentInfoFactory = new PaintDocumentInfoFactory();
        if(type.equals("normal"))
            document = new NormalPaintDocument(documentInfoFactory);
        else if(type.equals("fancy"))
            document = new FancyPaintDocument(documentInfoFactory);
        return document;
    }
}
