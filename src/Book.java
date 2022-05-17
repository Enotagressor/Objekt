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

}