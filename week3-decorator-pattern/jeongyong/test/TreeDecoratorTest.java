import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreeDecoratorTest {
    @Test
    public void decoratorPatternTest() {
        ChristmasTree christmasTree = new Garland(new ChristmasTreeImpl());
        christmasTree.decorate();

        ChristmasTree christmasTree1 = new TreeDecorator(new ChristmasTreeImpl());

        christmasTree1.decorate();
    }
}