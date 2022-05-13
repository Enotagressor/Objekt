public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Иванов","Денис");
        Author author2 = new Author("Мухамедов","Ашот");
        Book book1 = new Book("Виват", 1015, author1);
        Book book2 = new Book("Салам", 2015, author2);

        System.out.println("newBook = " + book1.getName() +" г.и. " + book1.getPublishingYear() + " Автор: " + book1.getAuthorName());
        System.out.println("newBook = " + book2.getName() +" г.и. " + book2.getPublishingYear() + " Автор: " + book2.getAuthorName());
        book1.setPublishingYear(2002);
        System.out.println("newBook = " + book1.getName() +" г.и. " + book1.getPublishingYear() + " Автор: " + book1.getAuthorName());
    }
}