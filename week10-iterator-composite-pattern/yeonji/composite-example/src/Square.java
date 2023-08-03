public class Square implements Shape {
	private String text;

	public Square(String text) {
		this.text = "Square : " + text;
	}

	@Override
	public void printText() {
		System.out.println(text);
	}
}
