package test.method.factory;

import main.method.factory.AlbumFactory;
import main.method.factory.BookFactory;
import main.method.factory.ItemFactory;
import main.method.factory.MovieFactory;
import main.method.product.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static main.method.product.Item.Type.*;

class ItemFactoryTest {
    @Test
    public void createItemFactory() throws Exception {

        ItemFactory albumFactory = new AlbumFactory();
        ItemFactory bookFactory = new BookFactory();
        ItemFactory movieFactory = new MovieFactory();

        Item album = albumFactory.createItem();
        Item book = bookFactory.createItem();
        Item movie = movieFactory.createItem();

        Assertions.assertTrue(album.itemType().equals(ALBUM));
        Assertions.assertTrue(book.itemType().equals(BOOK));
        Assertions.assertTrue(movie.itemType().equals(MOVIE));

    }
}