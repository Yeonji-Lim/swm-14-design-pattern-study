public abstract class ThinkerBell {
	protected Think think;

	protected ThinkerBell(Think think) {
		this.think = think;
	}

	public abstract void printResponse();
}
