public class MacBook {

	private CTypeInput cTypeInput;

	public void connect(CTypeInput cTypeInput) {
		this.cTypeInput = cTypeInput;
	}

	public void printConnection() {
		System.out.println("MacBook connect : " + cTypeInput.getCTypeInput());
	}
}
