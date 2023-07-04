public class TimeChangedStampOnCommand implements Command{
    private TimeChangedStamp timeChangedStamp;

    public TimeChangedStampOnCommand(TimeChangedStamp timeChangedStamp) {
        this.timeChangedStamp = timeChangedStamp;
    }

    @Override
    public void execute() {
        timeChangedStamp.save();
    }
}
