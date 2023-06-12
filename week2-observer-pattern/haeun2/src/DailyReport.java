public class DailyReport {
    String forWho;
    String AIDiary;
    String Graph;

    public DailyReport(String forWho) {
        this.forWho = forWho;
    }

    public void setAIDiary(String AIDiary) {
        this.AIDiary = AIDiary;
    }

    public void setGraph(String Graph) {
        this.Graph = Graph;
    }

    public String getAIDiary() {
        return AIDiary;
    }

    public String getGraph() {
        return Graph;
    }

    public void printDailyReport() {
        System.out.println("Daily Report: " + forWho);
        System.out.println("AI Diary: " + AIDiary);
        System.out.println("Graph: " + Graph);
    }
}
