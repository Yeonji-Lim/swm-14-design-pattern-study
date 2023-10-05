public class ThinkCustomer implements Think {
	private String prompt = "Answer the target customers of healthcare service";

	@Override
	public String getPrompt() {
		return this.prompt;
	}

	@Override
	public String getResponse() {
		// 프롬프트로 생각
		String answer = "Patients, Doctors, and Hospitals.";
		return answer;
	}
}
