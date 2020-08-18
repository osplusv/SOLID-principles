package mx.tec;

public class TestMammal {
    public static void main(String[] args) {
        System.out.println("Hello World\n");

        Mammal cat = new Mammal(new CatNoise());
        Mammal dog = new Mammal(new DogNoise());

        System.out.println("Cat says " + cat.makeNoise());
        System.out.println("Dog says " + dog.makeNoise());
    }
}
