package LibraryOopsAssignment;

public class Library extends Book{


    public String libraryName;
    public static int libraryCount =0;

    public Library(){
        this.libraryName = libraryName;
    }

    //public Library(Library libraryName){
    //    this.libraryName = libraryName;
    //}

    public Library(String libraryName){
        this.libraryName = libraryName;
    }


    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    {
        libraryCount += 1;
    }

    public int getLibraryName() {
        return libraryCount;
    }

    public static int getLibraryCount(){
        return libraryCount;
    }
}
