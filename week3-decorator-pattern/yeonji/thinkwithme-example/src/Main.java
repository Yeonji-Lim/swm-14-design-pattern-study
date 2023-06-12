
public class Main {
    public static void main(String[] args) {
        Board board = new BasicBoard();
        System.out.println("기본 화이트보드 : " + board.getFunctionListInStr());

        Board FABoard = new FADecorator(new BasicBoard());
        System.out.println("FA 화이트보드 : " + FABoard.getFunctionListInStr());

        Board anonBoard = new AnonymousDecorator(new BasicBoard());
        System.out.println("익명 화이트보드 : " + anonBoard.getFunctionListInStr());

        Board FAAnonBoard = new FADecorator(new AnonymousDecorator(new BasicBoard()));
        System.out.println("FA 익명 화이트보드 : " + FAAnonBoard.getFunctionListInStr());
    }
}