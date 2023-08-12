public class Off implements ModalState{
    @Override
    public ModalState pushButton() {
        System.out.println("action: turn on");
        System.out.println("** showing modal **");
        System.out.println();
        return new On();
    }
}
