public class FancyPaintDocument extends Document {
    public FancyPaintDocument(DocumentInfoFactory documentInfoFactory) {
        this.filename = "new_fancy_paint_document.png";
        this.info = "Fancy Paint Document";
        this.documentInfoFactory = documentInfoFactory;
    }

    @Override
    public void prepare() {
        this.feature = documentInfoFactory.createFeature();
    }
}
