public class Book {
    private String title;
    private String description;
    private String isbn;
    private String writer;
    private double price;

    public Book(String title, String description, String isbn, String writer, double price) {
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.writer = writer;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
}