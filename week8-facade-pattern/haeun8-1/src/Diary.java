public class Diary {
    private String memolet;

    public Diary(String memolet) {
        this.memolet = memolet;
    }
    public void addToAiServer() {
        System.out.println("** memolet [" + memolet+ "] is added to AI server");
    }
}
