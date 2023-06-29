public class WhiteBoard {
    private static WhiteBoard whiteBoard = new WhiteBoard();
    private static String content = "";

    private WhiteBoard() {}

    public static WhiteBoard getInstance() {
        return whiteBoard;
    }

    public synchronized static void print() {
        content += "ㅁ";
        System.out.println(content);
    }
}