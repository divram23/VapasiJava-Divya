package LibraryOopsAssignment;

public class Application {
    public static void main(String[] args) {


        Book book1 = new Book("Book1");
        book1.setDetails("Book1", "A1", 12345, 100);
        Book book2 = new Book("Book2");
        book2.setDetails("Book2", "A2", 234, 230);
        Book book3 = new Book("Book3");
        book3.setDetails("Book3", "A3", 767578, 249);


        int count = Book.numberOfBooks;
        System.out.println("Number of Books created: " + count);

    }
}
