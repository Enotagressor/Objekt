public class Author {

    public String authorName;
    public String authorFamily;


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
}
