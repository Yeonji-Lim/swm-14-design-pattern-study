package main.abstracts.product.keyboard;

import static main.abstracts.product.keyboard.Keyboard.Type.LG;

public class LGKeyboard implements Keyboard{
    @Override
    public Type brandType() {
        System.out.println("KEYBOARD : LG");
        return LG;
    }
}
