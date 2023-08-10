public class SoldOutState implements State {
	@Override
	public void increaseCoin(int coin, VendingMachine vendingMachine) {
		vendingMachine.returnCoin(coin);
		vendingMachine.changeState(new NoCoinState());
	}

	@Override
	public void buyProduct(VendingMachine vendingMachine) {
		System.out.println("상품이 품절되었습니다.");
	}
}
