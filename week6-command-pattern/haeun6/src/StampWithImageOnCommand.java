public class StampWithImageOnCommand implements Command{
    StampWithImage stampWithImage;

    public StampWithImageOnCommand(StampWithImage stampWithImage) {
        this.stampWithImage = stampWithImage;
    }

    @Override
    public void execute() {
        stampWithImage.save();
    }
}
