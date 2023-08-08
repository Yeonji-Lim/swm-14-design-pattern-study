package level;

public class Level2 implements Level{

    @Override
    public Level power() {
        System.out.println("❌");
        return new Off();
    }

    @Override
    public Level up() {
        System.out.println("💡💡💡");
        return new Level3();
    }
}
