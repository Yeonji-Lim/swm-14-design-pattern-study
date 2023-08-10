public class Main {
	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine(2);
		vendingMachine.insertCoin(1);
		vendingMachine.buyProduct();

		vendingMachine.insertCoin(1);
		vendingMachine.buyProduct();

		vendingMachine.insertCoin(1);
		vendingMachine.buyProduct();
	}
}
