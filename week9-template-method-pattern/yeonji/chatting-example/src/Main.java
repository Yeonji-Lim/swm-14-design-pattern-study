public class Main {
	public static void main(String[] args) {
		ChatService chatService = new NormalChatService();
		chatService.startChat("Hello");
		System.out.println("====================================");
		chatService.startChat("Hello AI");
		System.out.println("====================================");
		chatService = new MentorAIChatService();
		chatService.startChat("Hello");
		System.out.println("====================================");
		chatService.startChat("Hello AI");
		System.out.println("====================================");
	}
}
