import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class VendingMachine {
	private State state;
	private int coin;
	private int product;

	public VendingMachine(int product) {
		this.product = product;
		this.state = new NoCoinState();
		this.coin = 0;
	}

	public void insertCoin(final int coin) {
		state.increaseCoin(coin, this);
	}

	public void increaseCoin(final int coin) {
		this.coin += coin;
	}

	public void buyProduct() {
		state.buyProduct(this);
	}

	public void changeState(final State state) {
		this.state = state;
	}

	public void returnCoin(final int coin) {
		System.out.println("상품이 품절되었습니다.");
		System.out.println("잔돈 " + coin + "원을 반환합니다.");
	}

	public void provideProduct() {
		System.out.println("상품을 제공합니다.");
	}

	public void decreaseCoin() {
		coin--;
	}

	public boolean hasNoCoin() {
		return coin == 0;
	}

	public void decreaseProduct() {
		product--;
	}

	public boolean hasNoProduct() {
		return product == 0;
	}
}
