public class ThinkerBell2 extends ThinkerBell {
	public static final String printArea = "구역 2";

	public ThinkerBell2(Think think) {
		super(think);
	}

	@Override
	public void printResponse() {
		System.out.println("This is " + printArea + ".");
		System.out.println("Prompt: " + think.getPrompt() + " / Response: " + think.getResponse());
	}
}
