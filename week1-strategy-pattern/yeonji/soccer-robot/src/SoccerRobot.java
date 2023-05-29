public class SoccerRobot {
    private String name;
    private PlayStrategy playStrategy = new basicStrategy();

    public SoccerRobot(String name) {
        this.name = name;
    }

    public void setPlayStrategy(PlayStrategy playStrategy) {
        this.playStrategy = playStrategy;
    }

    public void play() {
        System.out.println(this.name + " : " + this.playStrategy.playSoccer());
    }
}
