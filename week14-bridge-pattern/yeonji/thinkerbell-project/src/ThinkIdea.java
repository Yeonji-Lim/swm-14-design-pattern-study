public class ThinkIdea implements Think {
	private String prompt = "Answer the creative ideas of software development.";

	@Override
	public String getPrompt() {
		return this.prompt;
	}

	@Override
	public String getResponse() {
		// 프롬프트로 생각
		String answer = "AI-Powered Personal Assistants, Virtual Reality (VR) for Education, and Blockchain Technology.";
		return answer;
	}
}
