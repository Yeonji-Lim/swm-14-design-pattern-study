package level;

public class Level1 implements Level{

    @Override
    public Level power() {
        System.out.println("❌");
        return new Off();
    }

    @Override
    public Level up() {
        System.out.println("💡💡");
        return new Level2();
    }
}
