public class Print {
        public static void main(String[] args) {

        Author author1 = new Author("Иванов","Денис");
        Author author2 = new Author("Мухамедов","Ашот");
        Book book1 = new Book("Виват", 1015, author1);
        Book book2 = new Book("Салам", 2015, author2);

        System.out.println(book1.getAuthor().getAuthorName() + " " +  book1.getAuthor().getAuthorFamily() +": " + book1.getName() +": " + book1.getPublishingYear());
        System.out.println(book2.getAuthor().getAuthorName() + " " +  book2.getAuthor().getAuthorFamily() +": " + book2.getName() +": " + book2.getPublishingYear());
        book1.setPublishingYear(2002);
        System.out.println(book1.getAuthor().getAuthorName() + " " +  book1.getAuthor().getAuthorFamily() +": " + book1.getName() +": " + book1.getPublishingYear());
    }
}
