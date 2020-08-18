package mx.tec;

public class Mammal {
    MakingNoise speaker;

    public Mammal(MakingNoise speaker) {
        this.speaker = speaker;
    }

    public String makeNoise() {
        return this.speaker.makeNoise();
    }
}
