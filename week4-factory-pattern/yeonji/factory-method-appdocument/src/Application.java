public abstract class Application {
    public abstract Document createDocument(String type);
    public void openDocument(String filename){
        // 문서 저장한 곳에서 문서 찾음
        // 찾은 문서 열기
    }

    public void newDocument(String type){
        Document doc = createDocument(type);
        doc.open();
    }
}
