public class Moo {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void talk() {
        // from kakao chat bot
        command.execute();
    }
}
