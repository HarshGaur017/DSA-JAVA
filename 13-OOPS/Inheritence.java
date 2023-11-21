
public class Inheritence {

    public static void main(String[] args) {
        Fish whale = new Fish();
        whale.eat();
    }
    
}

//Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived Class
class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("SWIMS");
    }
}