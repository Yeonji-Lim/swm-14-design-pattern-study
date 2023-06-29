public class Main {
    public static void main(String[] args) {
        WhiteBoard whiteBoard = WhiteBoard.getInstance();
        WhiteBoard whiteBoard1 = WhiteBoard.getInstance();
        whiteBoard.print();
        whiteBoard1.print();
        whiteBoard.print();
    }
}
