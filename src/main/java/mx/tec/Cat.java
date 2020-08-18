package mx.tec;

public class Cat extends Mammal {
    CatNoise behavior = new CatNoise();

    public String makeNoise() {
        return behavior.makeNoise();
    }
}