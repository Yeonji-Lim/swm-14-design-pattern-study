package main.abstracts.product.keyboard;

import static main.abstracts.product.keyboard.Keyboard.Type.SAMSUNG;

public class SamsungKeyboard implements Keyboard{
    @Override
    public Type brandType() {
        System.out.println("KEYBOARD : SAMSUNG");
        return SAMSUNG;
    }
}
