public class Book {
    private final Author Author;
    private final String name;
    private int publishingYear;


    public Book (String name, int publishingYear, Author Author){
        this.name = name;
        this.publishingYear = publishingYear;
        this.Author = Author;
    }

    public String getAuthorName() {
        return Author.getAuthorFamily() + " " + Author.getAuthorName();
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

}