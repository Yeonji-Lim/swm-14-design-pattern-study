public class ReportAIDiaryListener implements ReportListener {
    private DailyReport aidiary;

    public ReportAIDiaryListener(String forWho) {
        this.aidiary = new DailyReport(forWho);
    }

    @Override
    public void update(String reportType, String stampType) {
        System.out.println("-- Create AI Diary to DailyReport");
        aidiary.setAIDiary("AIDiary about " + stampType);
        System.out.println("Daily Report: " + aidiary.forWho);
        System.out.println("AI Diary: " + aidiary.AIDiary);
        System.out.println("");
    }
}