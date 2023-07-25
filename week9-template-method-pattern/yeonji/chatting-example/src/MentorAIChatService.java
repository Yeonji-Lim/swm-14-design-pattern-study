public class MentorAIChatService extends ChatService {
	@Override
	String requestAI(String message) {
		return "Mentor AI : You request [" + message + "] and I will recommend you to ...";
	}

	@Override
	void saveAIResponse(String response) {
		System.out.println("Mentor AI Response saved to mentorResponseRepository : " + response);
	}

	@Override
	void finishChat() {
		System.out.println("Mentor AI Chat finished");
	}
}
