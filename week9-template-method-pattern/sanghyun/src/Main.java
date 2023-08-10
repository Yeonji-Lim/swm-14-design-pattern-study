public class Main {
    public static void main(String[] args) {
        Item album = new Album("album-name", 8000, 10, "album-artist", "album-etc");
        Item book = new Book("book-name", 12000, 10, "book-author", "book-isbn");
        Item movie = new Movie("movie-name", 6000, 10, "movie-actor", "movie-director");

        album.order(3);
        book.order(2);
        movie.order(1);
    }
}