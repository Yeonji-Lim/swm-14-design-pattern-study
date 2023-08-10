public class FARecord {
	private String receiver;
	private String content;

	public FARecord(String receiver, String content) {
		this.receiver = receiver;
		this.content = content;
	}

	public String toString() {
		return "FA said to " + receiver + " : " + content;
	}
}
