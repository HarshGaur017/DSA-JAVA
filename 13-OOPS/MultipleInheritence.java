public class MultipleInheritence {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatflesh();
        b.eatgrass();
    }
}

interface Herbivore{
    void eatgrass();
}

interface Carnivore{
    void eatflesh();
}

class Bear implements Herbivore, Carnivore{
    public void eatgrass(){
        System.out.println("Eats Grass");
    }
    public void eatflesh(){
        System.out.println("Eats Flesh Also");
    }
}