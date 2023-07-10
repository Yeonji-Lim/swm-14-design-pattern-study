public class USBToCAdapter implements CTypeInput {

	private final MonitorUSBInput usbInput;

	public USBToCAdapter(MonitorUSBInput usbInput) {
		this.usbInput = usbInput;
	}

	@Override
	public String getCTypeInput() {
		return usbInput.getUSBInput();
	}
}
