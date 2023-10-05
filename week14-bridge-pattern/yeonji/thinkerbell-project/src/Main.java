public class Main {
	public static void main(String[] args) {
		ThinkerBell IdeaThinkerBell1 = new ThinkerBell1(new ThinkIdea());
		ThinkerBell CustomerThinkerBell2 = new ThinkerBell2(new ThinkCustomer());
		IdeaThinkerBell1.printResponse();
		CustomerThinkerBell2.printResponse();
	}
}
