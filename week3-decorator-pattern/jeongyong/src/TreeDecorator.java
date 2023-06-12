public class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }
    @Override
    public void decorate() {
        tree.decorate();
    }
}