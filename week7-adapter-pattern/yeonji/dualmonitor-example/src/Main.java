public class Main {
	public static void main(String[] args) {
		MacBook macBook = new MacBook();
		IPhoneCtypeInput iPhoneCtypeInput = new IPhoneCtypeInput("iPhone 12");
		macBook.connect(iPhoneCtypeInput);
		macBook.printConnection();

		MonitorUSBInput usbInput = new MonitorUSBInput("iMac Monitor");
		macBook.connect(new USBToCAdapter(usbInput));
		macBook.printConnection();
	}
}
