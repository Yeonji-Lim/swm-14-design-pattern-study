public class Modal {

    private ModalState state;

    public Modal() {
        this.state = new Off();
    }

    public void pushButton() {
        this.state = this.state.pushButton();
    }
}
