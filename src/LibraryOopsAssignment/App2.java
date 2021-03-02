package LibraryOopsAssignment;

public class App2 {
    public static void main(String[] args) {

        Furniture furniture1 = new Furniture();
        furniture1.setLibraryName("LIBRARY1");
        furniture1.setFurnitureName("cupboard1");
        furniture1.setDetails("book1", "A89789", 868686, 890);
        furniture1.setDetails("book2", "A786868", 78978, 6787);
        furniture1.setDetails("book3", "A7346464",897979, 235);

        Furniture furniture2 = new Furniture();
        furniture2.setLibraryName("LIBRARY2");
        furniture2.setFurnitureName("cupboard2");
        furniture2.setDetails("book1", "A89789", 868686, 890);
        furniture2.setDetails("book2", "A786868", 78978, 6787);
        furniture2.setDetails("book3", "A7346464",897979, 235);

        int count = Book.numberOfBooks;
        int countFurniture = Furniture.numberOfFurnitures;
        int countLibrary = Library.libraryCount;
        System.out.println("No of LIBRARYS Created:"+countLibrary);
        System.out.println("Number of Books created in the Library:" + count);
        System.out.println("Number of Furniture in the Library:" + countFurniture);


    }
}