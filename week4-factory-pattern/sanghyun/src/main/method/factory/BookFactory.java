package main.method.factory;

import main.method.product.Book;
import main.method.product.Item;

public class BookFactory implements ItemFactory{
    @Override
    public Item createItem() {
        return new Book();
    }
}
