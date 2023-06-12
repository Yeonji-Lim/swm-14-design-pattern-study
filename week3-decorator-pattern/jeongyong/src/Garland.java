public class Garland extends TreeDecorator {
    public Garland(ChristmasTree tree) {
        super(tree);
    }
    @Override
    public void decorate() {
        super.decorate();
        decorateWithTreeDecorator();
    }
    private void decorateWithTreeDecorator() {
        System.out.println("Flower");
    }
}
