package PolymorphismAssignment;

public class Degree {
    Degree(){

    }

    public void getDegree(){
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree{
    Undergraduate(){

    }
    public void getDegree(){
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree{
    Postgraduate(){

    }
    public void getDegree(){
        System.out.println("I am a Postgraduate");
    }

    public static void main(String[] args) {
        Degree d1 = new Degree();
        d1.getDegree();

        Undergraduate d2 = new Undergraduate();
        d2.getDegree();

        Postgraduate d3 = new Postgraduate();
        d3.getDegree();
    }
}
