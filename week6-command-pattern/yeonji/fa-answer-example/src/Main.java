public class Main {
	public static void main(String[] args) {
		ChatAssistant chatAssistant = new ChatAssistant();
		ChatCommand chatCommand = new ChatCommand(chatAssistant);
		SummaryAssistant summaryAssistant = new SummaryAssistant();
		SummaryCommand summaryCommand = new SummaryCommand(summaryAssistant);

		User user = new User(chatCommand);
		user.sendCommand();
		user.setCommand(summaryCommand);
		user.sendCommand();
	}
}
