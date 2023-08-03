public class Main {
	public static void main(String[] args) {
		Template ideationTemplate = new Template("[Ideation Template]");
		ideationTemplate.addShape(new Circle("Health Service Idea"));
		ideationTemplate.addShape(new Square("SNS Service Idea"));
		ideationTemplate.addShape(new Triangle("Education Service Idea"));

		Template designTemplate = new Template("[Design Template]");
		designTemplate.addShape(ideationTemplate);

		designTemplate.printText();
	}
}
