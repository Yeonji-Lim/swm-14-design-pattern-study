public class Book extends Item {

    private String author;
    private String isbn;

    public Book(String name, Integer price, Integer quantity, String author, String isbn) {
        super(name, price, quantity);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void getInfomation() {
        System.out.println("Information : author=" + author+", isbn="+isbn);
    }
}
