package main.abstracts.product.keyboard;

public interface Keyboard {

    Type brandType();

    enum Type {
        SAMSUNG, LG
    }
}
