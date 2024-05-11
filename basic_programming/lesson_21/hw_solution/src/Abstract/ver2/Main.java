package Abstract.ver2;

public class Main {
    public static void main(String[] args) {
        MusicalInstrument guitar = new Guitar();
        MusicalInstrument piano = new Piano();
        MusicalInstrument violin = new Violin();

        guitar.playNote();
        piano.playNote();
        violin.playNote();

    }
}
