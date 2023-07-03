public class SummaryCommand implements Command {

	private SummaryAssistant summaryAssistant;

	public SummaryCommand(SummaryAssistant summaryAssistant) {
		this.summaryAssistant = summaryAssistant;
	}

	@Override
	public void execute() {
		summaryAssistant.doSummary();
	}
}
