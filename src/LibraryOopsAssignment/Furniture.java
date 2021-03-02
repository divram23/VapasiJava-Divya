package LibraryOopsAssignment;

public class Furniture extends Library {

    public static int numberOfFurniture;
    String furnitureName;
    public static int numberOfFurnitures = 0;

    public Furniture(){
           this.furnitureName = furnitureName;
    }

    public Furniture(String furnitureName){
        this.furnitureName = furnitureName;
    }

    public Furniture(Object objectName){
        this.furnitureName= furnitureName;
    }


    {
        numberOfFurnitures += 1;
    }
    public static int getFurnitureCount(){
        return numberOfFurnitures;
    }




    public void setFurnitureName(String furnitureName) {
        this.furnitureName = furnitureName;
    }
}
