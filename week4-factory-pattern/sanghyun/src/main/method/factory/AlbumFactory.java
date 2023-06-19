package main.method.factory;

import main.method.product.Album;
import main.method.product.Item;

public class AlbumFactory implements ItemFactory{
    @Override
    public Item createItem() {
        return new Album();
    }
}
