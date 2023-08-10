public interface State {
	void increaseCoin(final int coin, final VendingMachine vendingMachine);

	void buyProduct(final VendingMachine vendingMachine);
}
