public class PaintDocumentInfoFactory implements DocumentInfoFactory {
    @Override
    public Feature createFeature() {
        return new PaintFeature();
    }
}
