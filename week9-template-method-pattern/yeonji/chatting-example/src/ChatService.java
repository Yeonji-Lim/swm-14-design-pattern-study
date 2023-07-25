public abstract class ChatService {

	void startChat(String message) {
		putMessage(message);
		saveMessage(message);
		if(message.contains("AI")) {
			String response = requestAI(message);
			putMessage(response);
			saveAIResponse(response);
		}
		finishChat();
	}

	void putMessage(String message) {
		System.out.println(message);
	}

	void saveMessage(String message) {
		System.out.println("Chat Message saved : " + message);
	}

	// Hook method
	String requestAI(String message) {
		return "";
	}

	void saveAIResponse(String response) {
	}

	abstract void finishChat();
}
