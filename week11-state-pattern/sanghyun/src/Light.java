import level.Level;
import level.Off;

public class Light {

    private Level level;

    public Light() {
        this.level = new Off();
    }

    public void power() {
        Level newLevel = level.power();
        this.level = newLevel;
    }

    public void up() {
        Level newLevel = level.up();
        this.level = newLevel;
    }
}
