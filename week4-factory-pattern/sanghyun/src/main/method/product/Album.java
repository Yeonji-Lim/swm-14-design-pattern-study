package main.method.product;

import static main.method.product.Item.Type.ALBUM;

public class Album implements Item{
    @Override
    public Type itemType() {
        System.out.println("ITEM : ALBUM");
        return ALBUM;
    }
}
