public class SelectableState implements State {
	@Override
	public void increaseCoin(int coin, VendingMachine vendingMachine) {
		vendingMachine.increaseCoin(coin);
		if(vendingMachine.hasNoProduct()) {
			vendingMachine.changeState(new SoldOutState());
		}
	}

	@Override
	public void buyProduct(VendingMachine vendingMachine) {
		vendingMachine.provideProduct();
		vendingMachine.decreaseProduct();
		vendingMachine.decreaseCoin();
		if(vendingMachine.hasNoCoin()) {
			vendingMachine.changeState(new NoCoinState());
		}
		if(vendingMachine.hasNoProduct()) {
			vendingMachine.changeState(new SoldOutState());
		}
	}
}
