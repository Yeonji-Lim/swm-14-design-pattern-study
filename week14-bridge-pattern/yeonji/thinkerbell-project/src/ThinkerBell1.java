public class ThinkerBell1 extends ThinkerBell {
	public static final String printArea = "구역 1";

	public ThinkerBell1(Think think) {
		super(think);
	}

	@Override
	public void printResponse() {
		System.out.println("This is " + printArea + ".");
		System.out.println("Prompt: " + think.getPrompt());
		System.out.println("Response: " + think.getResponse());
	}
}
