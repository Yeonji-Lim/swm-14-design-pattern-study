public class NoCoinState implements State {
	@Override
	public void increaseCoin(int coin, VendingMachine vendingMachine) {
		vendingMachine.increaseCoin(coin);
		vendingMachine.changeState(new SelectableState());
	}

	@Override
	public void buyProduct(VendingMachine vendingMachine) {
		System.out.println("동전을 넣어주세요.");
	}
}
