public class ChatCommand implements Command {

	private ChatAssistant chatAssistant;

	public ChatCommand(ChatAssistant chatAssistant) {
		this.chatAssistant = chatAssistant;
	}

	@Override
	public void execute() {
		chatAssistant.greet();
	}
}
