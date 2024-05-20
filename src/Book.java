public class Book {
    String title ;
    String author;
    int isbn;

    public Book() {
    }

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isbn = 100000;

    }

    public Book(String title) {
        this.author = "Unknown";
        this.isbn = 000000;
        this.title = title;
    }
}