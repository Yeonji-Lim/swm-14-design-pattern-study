package main.method.product;

import static main.method.product.Item.Type.MOVIE;

public class Movie implements Item{
    @Override
    public Type itemType() {
        System.out.println("ITEM : MOVIE");
        return MOVIE;
    }
}
