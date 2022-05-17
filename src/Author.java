import java.util.Objects;

public class Author {

    private final String authorName;
    private final String authorFamily;


    public Author(String authorFamily, String authorName) {
        this.authorName = authorName;
        this.authorFamily = authorFamily;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorFamily() {
        return this.authorFamily;
    }

    @Override
    public String toString() {
        return  authorName + " " +  authorFamily + ": ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorFamily, author.authorFamily);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorFamily);
    }
}
