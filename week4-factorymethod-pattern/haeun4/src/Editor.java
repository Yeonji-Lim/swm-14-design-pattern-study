public abstract class Editor {
    public void createReport() {
        StampList stampList = editStampList();
        stampList.listUp();
        System.out.println("=====================");
        System.out.println("스탬프: memolet ~~ ...");
        System.out.println("스탬프: memolet ~~ ...");
    }
    public abstract StampList editStampList();
}
