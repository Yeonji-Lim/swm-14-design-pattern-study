public class Curve {

    private String stamp;

    public Curve(String stamp) {
        this.stamp = stamp;
    }
    public void addToMoodCurve() {
        System.out.println("** stamp [" + stamp + "] is added to Mood Curve");
    }
}
