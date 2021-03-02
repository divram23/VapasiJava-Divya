package LibraryOopsAssignment;

public class Book{
    public static int numberOfBooks = 0;
    private String name;
    private int ISBN;
    private int pages;
    private String author;


    public Book() {
        this.name = name;
        System.out.println("This is default constructor");
    }

    Book(String name) {
        this.name = name;
        System.out.println("This is Parametrized constructor");

    }

    public void setDetails(String name, String author, int ISBN, int pages) {
        {
            this.name = name;
            this.author = author;
            this.ISBN = ISBN;
            this.pages = pages;
        }


        {
            numberOfBooks += 1;
        }
    }
}

