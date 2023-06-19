package main.method.product;

import static main.method.product.Item.Type.BOOK;

public class Book implements Item{
    @Override
    public Type itemType() {
        System.out.println("ITEM : BOOK");
        return BOOK;
    }
}
