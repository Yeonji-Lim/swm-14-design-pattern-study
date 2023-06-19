package main.abstracts.product.mouse;

import static main.abstracts.product.mouse.Mouse.Type.LG;

public class LGMouse implements Mouse{
    @Override
    public Type brandType() {
        System.out.println("MOUSE : LG");
        return LG;
    }
}
