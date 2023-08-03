public class StampAggregate implements Aggregate {
    private String[] stampList;
    private int index;

    public StampAggregate(int maxSize) {
        this.stampList = new String[maxSize];
        this.index = 0;
    }

    public String getStampAt(int index) {
        return stampList[index];
    }

    public void appendStamp(String stamp) {
        this.stampList[index++] = stamp;
    }

    @Override
    public Iterator iterator() {
        return new StampIterator(stampList);
    }
}
