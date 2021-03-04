package Part1OopsDesignAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Library implements Department {
    String name;
    public static int countOfLibrary = 0;
    @Override
    public void setDepartmentName(String name) {

    }

    public void setLibraryName(String name) {
        this.name = name;
        countOfLibrary += 1;
    }

    Library(){
        this.name = name;
    }

    Library(String name){
        this.name = name;
    }
   }

class Books extends Library{
    public static int countOfBooks = 0;
    String name;
    int ISBN;
    char isBookRented;
    public static ArrayList<Character> BookStatus = new ArrayList<>();
    String author;
    public static int bookRented = 0;


    Books(){

    }
    Books(String name, int ISBN, char isBookRented, String author){
        this.name = name;
        this.ISBN = ISBN;
        this.isBookRented = isBookRented;
        this.author = author;
    }



    public void setBookDetails(String name, int ISBN, char isBookRented, String author) {

        this.name = name;
        this.ISBN = ISBN;
        this.isBookRented = isBookRented;
        this.author = author;
        BookStatus.add(isBookRented);
        countOfBooks += 1;

    }


    public static int getCountofBooksRented() {
        for (int i=0; i < BookStatus.size(); i++){
            if(BookStatus.get(i) == 'Y'){
                bookRented ++;
            }
        }
        return bookRented;
    }

}

class Furniture extends Library {

    String type;
    String material;
    public static int countOfFurniture = 0;
    public static int countofFurnitureType;
    public static MultiMap<String, String> furnitures = new MultiMap();

    Furniture() {

    }

    Furniture(String type, String material) {
        this.type = type;
        this.material = material;
    }


    public void setFurnitureDetails(String type, String material) {
        this.type = type;
        this.material = material;
        furnitures.put(type, material);
        countOfFurniture += 1;
    }

    public static int getCountOfFurrnitureType(String furnitureType) {
        String key = furnitureType;
        countofFurnitureType = furnitures.get(key).size();
        return countofFurnitureType;
        }

    }


    class Staff extends Library {
        public static int countOfStaff = 0;
        public static String EldestStaff;
        int age;
        String firstName;
        String lastName;
        public static Map<Integer, String> staffAges = new HashMap<>();

        Staff() {

        }

        Staff(int age, String firstName, String lastName) {
            this.age = age;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void setStaffDetails(int age, String firstName, String lastName) {
            this.age = age;
            this.firstName = firstName;
            this.lastName = lastName;
            staffAges.put(age, firstName);
            countOfStaff += 1;
        }

        public static String getEldestStaff() {
            int maxAge = Collections.max(staffAges.keySet());
            for (int j = 0; j < staffAges.size(); j++) {
                if (staffAges.containsKey(maxAge)) {
                    EldestStaff = staffAges.get(maxAge);
                }
            }
            return EldestStaff;
        }
    }









