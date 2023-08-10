public class Triangle implements Shape {
	private String text;

	public Triangle(String text) {
		this.text = "Triangle : " + text;
	}

	@Override
	public void printText() {
		System.out.println(text);
	}

}
