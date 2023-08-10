public class Circle implements Shape {
	private String text;

	public Circle(String text) {
		this.text = "Circle : " + text;
	}

	@Override
	public void printText() {
		System.out.println(text);
	}
}
