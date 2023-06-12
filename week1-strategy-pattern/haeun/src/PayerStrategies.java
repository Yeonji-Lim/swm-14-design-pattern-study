public class PayerStrategies implements Strategy{
    @Override
    public double excuteUpdateDifference(int cost, int count) {
        return cost / count * (count -1);
    }
}
