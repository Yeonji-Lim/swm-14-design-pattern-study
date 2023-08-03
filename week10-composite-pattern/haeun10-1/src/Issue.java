public class Issue extends Ticket {
    private final double startPoints;
    private double usedPoints;
    private String issueName;

    public Issue(String issueName, double startPoints, double usedPoints) {
        this.issueName = issueName;
        this.startPoints = startPoints;
        this.usedPoints = usedPoints;
    }

    @Override
    public double getStartPoints() {
        return startPoints;
    }

    @Override
    public double getUsedPoints() {
        return usedPoints;
    }
}
