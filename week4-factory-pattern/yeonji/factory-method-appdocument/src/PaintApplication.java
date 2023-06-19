public class PaintApplication extends Application {
    @Override
    public Document createDocument(String type) {
        Document document = null;
        if(type.equals("normal"))
            document = new NormalPaintDocument();
        else if(type.equals("fancy"))
            document = new FancyPaintDocument();
        return document;
    }
}
