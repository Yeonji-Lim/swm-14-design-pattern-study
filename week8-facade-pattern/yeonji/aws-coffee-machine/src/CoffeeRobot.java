public class CoffeeRobot {
	private CoffeeMachine coffeeMachine;

	public CoffeeRobot(CoffeeMachine coffeeMachine) {
		this.coffeeMachine = coffeeMachine;
	}

	public void makeCoffee() {
		coffeeMachine.grindCoffee();
		coffeeMachine.brewCoffee();
	}

}
