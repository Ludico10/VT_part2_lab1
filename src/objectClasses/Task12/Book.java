package objectClasses.Task12;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    protected Book() {
    }

    public Book(String title, String author, int price, int edition) {
        this.title = title;
        this.author = author;
        this.price = price;
        Book.edition = edition;
    }

    public Book(String title, String author, int price, int edition, int isbn) {
        this(title, author, edition, price);
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "title: " + title + System.lineSeparator() + "author: " + author + System.lineSeparator() +
                "price: " + price + System.lineSeparator() + "edition:  " + edition + System.lineSeparator();
    }

    @Override
    protected Object clone() {
        Book newBook = new Book();
        newBook.title = this.title;
        newBook.author = this.author;
        newBook.price = this.price;
        return newBook;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return price == book.price;
    }

    @Override
    public int hashCode() {
        return price * 36 % Integer.MAX_VALUE;
    }

    @Override
    public int compareTo(Book book) {
        return isbn - book.isbn;
    }
}
