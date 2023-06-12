public class AnonymousDecorator extends BoardDecorator {
    public AnonymousDecorator(Board decoratedBoard) {
        super(decoratedBoard);
    }

    @Override
    public String getFunctionListInStr() {
        return super.getFunctionListInStr() + ", 익명 기능";
    }
}
