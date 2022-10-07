package objectClasses.Task15;

import objectClasses.Task12.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Integer.compare(book1.getPrice(), book2.getPrice());
    }
}
