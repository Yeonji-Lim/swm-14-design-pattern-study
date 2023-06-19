package test.abstracts.factory;

import main.abstracts.factory.ComputerFactory;
import main.abstracts.factory.LGComputerFactory;
import main.abstracts.factory.SamsungComputerFactory;
import main.abstracts.product.keyboard.Keyboard;
import main.abstracts.product.keyboard.Keyboard.Type;
import main.abstracts.product.mouse.Mouse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static main.abstracts.product.mouse.Mouse.Type.LG;
import static main.abstracts.product.mouse.Mouse.Type.SAMSUNG;

class ComputerFactoryTest {

    @Test
    public void createComputerFactoryTest() throws Exception {
        ComputerFactory samsung = new SamsungComputerFactory();
        ComputerFactory lg = new LGComputerFactory();

        Keyboard samsungKeyboard = samsung.createKeyboard();
        Mouse samsungMouse = samsung.createMouse();

        Keyboard lgKeyboard = lg.createKeyboard();
        Mouse lgMouse = lg.createMouse();

        Assertions.assertTrue(samsungKeyboard.brandType().equals(Type.SAMSUNG));
        Assertions.assertTrue(samsungMouse.brandType().equals(SAMSUNG));
        Assertions.assertTrue(lgKeyboard.brandType().equals(Type.LG));
        Assertions.assertTrue(lgMouse.brandType().equals(LG));
    }

}