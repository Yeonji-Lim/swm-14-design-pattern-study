public class Editor {
    public ReportManager reports;

    public Editor() {
        this.reports = new ReportManager("AIDiary", "Graph");
    }

    public void editGraph(String stampType) {
        reports.notify("Graph", stampType);
    }

    public void editAIDiary(String stampType) {
        reports.notify("AIDiary", stampType);
    }

}