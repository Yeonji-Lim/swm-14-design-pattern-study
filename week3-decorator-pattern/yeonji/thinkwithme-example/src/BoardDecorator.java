public abstract class BoardDecorator extends Board { // Decorator
    private Board decoratedBoard;

    public BoardDecorator(Board decoratedBoard) {
        this.decoratedBoard = decoratedBoard;
    }

    @Override
    public String getFunctionListInStr() { return decoratedBoard.getFunctionListInStr(); }
}
