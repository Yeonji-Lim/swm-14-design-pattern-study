public class StampIterator implements Iterator {
    private String[] stampList;
    private int index;

    public StampIterator(String[] stampList) {
        this.stampList = stampList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < stampList.length;
    }

    @Override
    public String next() {
        return stampList[index++];
    }
}
