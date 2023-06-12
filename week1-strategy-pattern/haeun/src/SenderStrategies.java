public class SenderStrategies implements Strategy{
    @Override
    public double excuteUpdateDifference(int cost, int count) {
        return - cost / count;
    }
}
