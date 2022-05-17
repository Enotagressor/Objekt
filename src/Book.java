import java.util.Objects;

public class Book {
    private final Author author;
    private final String name;
    private int publishingYear;

    public Book (Author author, String name, int publishingYear){
        this.name = name;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public Author getAuthor() {
        return this.author;
        }


    public String getName() {
        return this.name;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear=publishingYear;
    }

    @Override
    public String toString() {
        return author.toString() + name + ": " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name);
    }
}
