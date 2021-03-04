package Part1OopsDesignAssignment;

public class College {
    College() {

    }

    public static void main(String[] args) {
        Engineering d1 = new Engineering();
        d1.setDepartmentName("Engineering1");
        d1.setDepartmentDetails("Lib1", "Lab1");
        String library1 = d1.getLibrary();

        Books books = new Books();
        books.setLibraryName(library1);
        books.setBookDetails("B1", 212121, 'N', "A1");
        books.setBookDetails("B2", 7797, 'Y', "A2");
        books.setBookDetails("B3", 7797, 'N', "A2");

        Furniture f1 = new Furniture();
        f1.setLibraryName(library1);
        f1.setFurnitureDetails("Chair", "wood");
        f1.setFurnitureDetails("Cupboard", "metal");

        Staff s1 = new Staff();
        s1.setLibraryName(library1);
        s1.setStaffDetails(23, "D5", "R1");

        Arts d2 = new Arts();
        d1.setDepartmentName("Arts1");
        d1.setDepartmentDetails("Lib2", "MUS1");
        String library2 = d1.getLibrary();


        Books books2 = new Books();
        books2.setLibraryName(library2);
        books2.setBookDetails("B1", 212121, 'Y', "A1");
        books2.setBookDetails("B2", 7797, 'Y', "A2");

        Furniture f2 = new Furniture();
        f2.setLibraryName(library2);
        f2.setFurnitureDetails("Chair", "metal");
        f2.setFurnitureDetails("Chair", "wood");
        f2.setFurnitureDetails("Cupboard", "metal");
        f2.setFurnitureDetails("Table", "wood");
        f2.setFurnitureDetails("Table", "metal");

        Staff s2 = new Staff();
        s2.setLibraryName(library2);
        s2.setStaffDetails(25, "D1", "R1");
        s2.setStaffDetails(27, "D2", "R2");

        int booksCount = Books.countOfBooks;
        System.out.println("Number of Books available in All Departments: "+booksCount);

        int booksRentedCount = Books.getCountofBooksRented();
        System.out.println("Number of Books Rented: "+booksRentedCount);

        int staffCount = Staff.countOfStaff;
        System.out.println("Total Staff: "+staffCount);
        String  Eldest = Staff.getEldestStaff();
        System.out.println("Eldest Staff Name: "+Eldest);

        Furniture.getCountOfFurrnitureType("Chair");
        System.out.println("Number of Chairs:"+Furniture.countofFurnitureType);

    }
}

interface Department{
    public void setDepartmentName(String name);
    public void setLibraryName(String name);
}

class Engineering implements Department{
    String name;
    String library;
    String lab;
    public static int countOfLibrary = 0;

    Engineering(){

    }

    public void setDepartmentName(String name) {
        this.name = name;

    }

    @Override
    public void setLibraryName(String name) {
        this.library =library;
        countOfLibrary += 1;
    }


    public void setDepartmentDetails(String library, String lab){
        this.library = library;
        this.lab = lab;
    }

    public String getLibrary() {
        return library;
    }
}

class Arts implements Department{
    String name;
    String library;
    String musicRoom;
    public static int countOfLibrary = 0;

    Arts(){

    }

    public void setDepartmentName(String name) {
        this.name = name;

    }

    @Override
    public void setLibraryName(String name) {
        this.library = library;
        countOfLibrary += 1;
    }

    public void setDepartmentDetails(String library, String musicRoom){
        this.library = library;
        this.musicRoom = musicRoom;
    }

    public String getLibrary() {
        return library;
    }
}
