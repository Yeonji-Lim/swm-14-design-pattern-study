public class ReportGraphListener implements ReportListener{
    private DailyReport graph;

    public ReportGraphListener(String forWho) {
        this.graph = new DailyReport(forWho);
    }

    @Override
    public void update(String reportType, String stampType) {
        System.out.println("-- Create graph to DailyReport");
        graph.setGraph("Graph about " + stampType);
        System.out.println("Daily Report: " + graph.forWho);
        System.out.println("Graph: " + graph.Graph);
        System.out.println("");
    }

}
