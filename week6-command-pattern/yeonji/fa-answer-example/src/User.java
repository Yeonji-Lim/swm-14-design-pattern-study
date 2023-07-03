public class User {
	private Command command;
	public User(Command command) {
		setCommand(command);
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void sendCommand() {
		command.execute();
	}
}
