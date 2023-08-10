public class On implements ModalState{
    @Override
    public ModalState pushButton() {
        System.out.println("action: turn off");
        System.out.println("** showing background image **");
        System.out.println();
        return new Off();
    }
}
