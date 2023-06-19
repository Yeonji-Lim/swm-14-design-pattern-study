package main.abstracts.factory;

import main.abstracts.product.keyboard.Keyboard;
import main.abstracts.product.keyboard.LGKeyboard;
import main.abstracts.product.mouse.LGMouse;
import main.abstracts.product.mouse.Mouse;

public class LGComputerFactory implements ComputerFactory{
    @Override
    public Keyboard createKeyboard() {
        return new LGKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new LGMouse();
    }
}
