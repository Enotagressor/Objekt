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
       for (Book book : library)
           if (book != null) {
               System.out.println(book);
           }
   }

    public static void main(String[] args) {

        Author author1 = new Author("Иванов","Денис");
        Author author2 = new Author("Мухамедов","Ашот");
        Author author3 = new Author("Ммедов","Ат");

        Book book1 = new Book(author1, "Виват", 1015);
        Book book2 = new Book(author2, "Салам", 2015);
        Book book3 = new Book(author3, "Сам", 205);

//        System.out.println(book1);
//        System.out.println(book2);
        book1.setPublishingYear(2002);
     //   System.out.println(book1);

        Book[] library = new Book[15];

        addNewBook(library, book1);
        addNewBook(library, book2);
        addNewBook(library, book3);
        printBook(library);

        System.out.println(book1.equals(book2));


    }
}

