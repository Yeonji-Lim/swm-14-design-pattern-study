import java.util.ArrayList;
import java.util.List;

public class Template implements Shape {
	private String text;
	private List<Shape> shapes = new ArrayList<>();

	public Template(String text) {
		this.text = text;
	}

	@Override
	public void printText() {
		System.out.println(text);
		for(Shape shape : shapes) {
			shape.printText();
		}
	}

	public void addShape(Shape shape) {
		shapes.add(shape);
	}
}
