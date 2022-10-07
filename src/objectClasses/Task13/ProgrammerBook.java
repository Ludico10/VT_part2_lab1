package objectClasses.Task13;

import objectClasses.Task12.Book;

public class ProgrammerBook extends Book {
    private final String language;
    private final  int level;

    public ProgrammerBook(String language, int level) {
        this.language = language;
        this.level = level;
    }

    @Override
    public int hashCode() {
        return level * 31 % Integer.MAX_VALUE;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProgrammerBook book = (ProgrammerBook) obj;
        return level == book.level;
    }

    @Override
    public String toString() {
        return "language: " + language + System.lineSeparator() + "level: " + level + System.lineSeparator();
    }
}
