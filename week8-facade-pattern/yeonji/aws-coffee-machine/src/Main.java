public class Main {
	public static void main(String[] args) {
		CoffeeMachine coffeeMachine = new AWSCoffeeMachine();
		CoffeeRobot coffeeRobot = new CoffeeRobot(coffeeMachine);
		coffeeRobot.makeCoffee();
	}
}
