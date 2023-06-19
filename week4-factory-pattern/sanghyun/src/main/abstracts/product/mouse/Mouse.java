package main.abstracts.product.mouse;

public interface Mouse {

    Type brandType();

    enum Type {
        LG, SAMSUNG
    }
}
