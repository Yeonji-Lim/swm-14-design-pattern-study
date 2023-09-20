package level;

public class Off implements Level{

    public void setLevel(Level level) {

    }

    @Override
    public Level power() {
        System.out.println("💡");
        return new Level1();
    }

    @Override
    public Level up() {
        System.out.println("전원이 꺼진 상태에서 밝기를 올릴 수 없습니다.");
        return this;
    }
}
