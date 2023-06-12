public class FADecorator extends BoardDecorator {

    public FADecorator(Board decoratedBoard) {
        super(decoratedBoard);
    }

    @Override
    public String getFunctionListInStr() {
        return super.getFunctionListInStr() + ", FA기능";
    }
}
