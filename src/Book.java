public class Book {
    private Author Author;
    private String name;
    private int publishingYear;


    public Book (String name, int publishingYear, Author Author){
        this.name = name;
        this.publishingYear = publishingYear;
        this.Author = Author;
    }

    public String getAuthorName() {
        return new String(Author.getAuthorFamily() + " " + Author.getAuthorName());
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return Author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear=publishingYear;
    }

}