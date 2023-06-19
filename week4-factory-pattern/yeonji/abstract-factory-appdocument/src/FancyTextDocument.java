public class FancyTextDocument extends Document {

    public FancyTextDocument(DocumentInfoFactory documentInfoFactory) {
        this.filename = "new_fancy_text_document.txt";
        this.info = "Fancy Text Document";
        this.documentInfoFactory = documentInfoFactory;
    }

    @Override
    public void prepare() {
        this.feature = documentInfoFactory.createFeature();
    }
}
