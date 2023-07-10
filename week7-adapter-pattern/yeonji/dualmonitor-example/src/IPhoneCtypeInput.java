public class IPhoneCtypeInput implements CTypeInput {
	private final String machineName;

	public IPhoneCtypeInput(String machineName) {
		this.machineName = machineName;
	}

	@Override
	public String getCTypeInput() {
		return this.machineName;
	}
}
