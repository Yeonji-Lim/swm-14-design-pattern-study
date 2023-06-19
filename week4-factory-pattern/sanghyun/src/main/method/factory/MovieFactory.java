package main.method.factory;

import main.method.product.Item;
import main.method.product.Movie;

public class MovieFactory implements ItemFactory{
    @Override
    public Item createItem() {
        return new Movie();
    }
}
