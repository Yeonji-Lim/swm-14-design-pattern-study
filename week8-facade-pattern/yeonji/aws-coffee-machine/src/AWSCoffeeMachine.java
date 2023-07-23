public class AWSCoffeeMachine implements CoffeeMachine {
	@Override
	public void grindCoffee() {
		System.out.println("Grinding coffee...");
	}

	@Override
	public void brewCoffee() {
		System.out.println("Brewing coffee...");
	}
}
