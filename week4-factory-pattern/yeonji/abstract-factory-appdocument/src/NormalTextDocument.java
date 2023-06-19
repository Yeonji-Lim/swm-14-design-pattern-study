public class NormalTextDocument extends Document {
    public NormalTextDocument(DocumentInfoFactory documentInfoFactory) {
        this.filename = "new_normal_text_document.txt";
        this.info = "Normal Text Document";
        this.documentInfoFactory = documentInfoFactory;
    }

    @Override
    public void prepare() {
        this.feature = documentInfoFactory.createFeature();
    }
}
