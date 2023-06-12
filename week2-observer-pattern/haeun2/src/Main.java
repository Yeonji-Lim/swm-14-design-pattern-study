public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.reports.subscribe(
                "Graph",
                new ReportGraphListener("haeun 230606"));
        editor.reports.subscribe(
                "AIDiary",
                new ReportAIDiaryListener("haeun 230607"));

        editor.editGraph("happy");
        editor.editAIDiary("happy");


    }
}