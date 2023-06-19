package main.abstracts.factory;

import main.abstracts.product.keyboard.Keyboard;
import main.abstracts.product.mouse.Mouse;

public interface ComputerFactory {
    Keyboard createKeyboard();
    Mouse createMouse();
}
