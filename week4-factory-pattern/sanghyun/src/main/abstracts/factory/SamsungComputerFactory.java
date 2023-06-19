package main.abstracts.factory;

import main.abstracts.product.keyboard.Keyboard;
import main.abstracts.product.keyboard.SamsungKeyboard;
import main.abstracts.product.mouse.Mouse;
import main.abstracts.product.mouse.SamsungMouse;

public class SamsungComputerFactory implements ComputerFactory{
    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }
}
