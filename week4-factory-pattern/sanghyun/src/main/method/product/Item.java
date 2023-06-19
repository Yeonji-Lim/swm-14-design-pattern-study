package main.method.product;

public interface Item {

    Type itemType();

    enum Type {
        ALBUM, BOOK, MOVIE
    }
}
