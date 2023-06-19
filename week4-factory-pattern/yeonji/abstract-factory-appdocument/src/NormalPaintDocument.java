public class NormalPaintDocument extends Document {
    public NormalPaintDocument(DocumentInfoFactory  documentInfoFactory) {
        this.filename = "new_normal_paint_document.png";
        this.info = "Normal Paint Document";
        this.documentInfoFactory = documentInfoFactory;
    }

    @Override
    public void prepare() {
        this.feature = documentInfoFactory.createFeature();
    }
}
