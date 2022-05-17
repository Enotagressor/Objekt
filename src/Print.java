public class Print {

    public static void addNewBook(Book[] library, Book addBook) {
            for (int i = 0; i < library.length; i++) {
                if (library[i] == null) {
                    library[i] = addBook;
                    break;
                }
            }
    }
   public static void printBook(Book[] library){
       for (int i = 0; i < library.length; i++) {
           if (library[i] != null){
               System.out.println(library[i].getAuthor().getAuthorName() + " " +  library[i].getAuthor().getAuthorFamily() +": " + library[i].getName() +": " + library[i].getPublishingYear());
           }
       }
   }

    public static void main(String[] args) {

        Author author1 = new Author("Иванов","Денис");
        Author author2 = new Author("Мухамедов","Ашот");
        Author author3 = new Author("Ммедов","Ат");

        Book book1 = new Book(author1, "Виват", 1015);
        Book book2 = new Book(author2, "Салам", 2015);
        Book book3 = new Book(author3, "Сам", 205);

//        System.out.println(book1.getAuthor().getAuthorName() + " " +  book1.getAuthor().getAuthorFamily() +": " + book1.getName() +": " + book1.getPublishingYear());
//        System.out.println(book2.getAuthor().getAuthorName() + " " +  book2.getAuthor().getAuthorFamily() +": " + book2.getName() +": " + book2.getPublishingYear());
        book1.setPublishingYear(2002);
//        System.out.println(book1.getAuthor().getAuthorName() + " " +  book1.getAuthor().getAuthorFamily() +": " + book1.getName() +": " + book1.getPublishingYear());

        Book[] library = new Book[15];

        addNewBook(library, book1);
        addNewBook(library, book2);
        addNewBook(library, book3);
        printBook(library);


    }
}

