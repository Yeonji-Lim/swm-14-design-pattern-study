public class TextDocumentInfoFactory implements DocumentInfoFactory {
    @Override
    public Feature createFeature() {
        return new TextFeature();
    }
}
