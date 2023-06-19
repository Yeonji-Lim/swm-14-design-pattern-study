package main.abstracts.product.mouse;

import static main.abstracts.product.mouse.Mouse.Type.SAMSUNG;

public class SamsungMouse implements Mouse{
    @Override
    public Type brandType() {
        System.out.println("MOUSE : SAMSUNG");
        return SAMSUNG;
    }
}
