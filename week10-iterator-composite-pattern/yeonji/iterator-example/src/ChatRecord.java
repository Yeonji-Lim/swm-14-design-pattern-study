public class ChatRecord {
	private String sender;
	private String content;

	public ChatRecord(String sender, String content) {
		this.sender = sender;
		this.content = content;
	}

	public String toString() {
		return sender + " : " + content;
	}
}
