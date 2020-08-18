package mx.tec;

public class Dog extends Mammal {
    DogNoise behavior = new DogNoise();

    public String makeNoise() {
        return behavior.makeNoise();
    }
}