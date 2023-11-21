public class HybridInheritence {
    public static void main(String[] args) {
        Dog lebra = new Dog();
        lebra.legs = 4;
        lebra.walks();
        lebra.eat();
        lebra.color = "red";
        System.out.println(lebra.color);
        System.out.println(lebra.legs);
    }
}

//BAse Class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

//Derived Classes
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("Swims");
    }
}
    class Shark extends Fish{
        String danger;
    }
    class tuna extends Fish{
        String little;
    }

class Bird extends Animal{
    String Feathers;
    void fly(){
        System.out.println("flies");
    }
}

    class Peacock extends Bird{
        String colorful;
    }

class Mammals extends Animal{
    int legs;
    void walks(){
        System.out.println("walks");
    }
}
    class Dog extends Mammals{
        void bark(){
            System.out.println("Barks");
        }
    }
    class Cat extends Mammals{
        void jump(){
            System.out.println("Jumpss");
        }
    }