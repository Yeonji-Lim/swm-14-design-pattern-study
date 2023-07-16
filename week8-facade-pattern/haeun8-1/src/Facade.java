public class Facade {

    String memolet;
    String stamp;

    public Facade(String memolet, String stamp) {
        this.memolet = memolet;
        this.stamp = stamp;
    }

    public void createDiary() {
        Curve curve = new Curve(stamp);
        Diary diary = new Diary(memolet);

        curve.addToMoodCurve();
        diary.addToAiServer();
    }

}
