public abstract class Document {
    String filename;
    String info;
    DocumentInfoFactory documentInfoFactory;
    Feature feature;

    public abstract void prepare();

    public void open() {
        System.out.println("open : " + filename);
    }
    public void save(String filename) {
        this.filename = filename;
        System.out.println("save : " + filename);
    }
    public void close() {
        System.out.println("close : " + filename);
    }
}
