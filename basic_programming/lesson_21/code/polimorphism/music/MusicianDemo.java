package code.polimorphism.music;

public class MusicianDemo {
    public static void main(String[] args) {
        RockMusician musician = new RockMusician();
        Singer singer = musician;
        Dancer dancer = musician;

        musician.greeting();
        musician.dance();
        musician.sing();

//        singer.sing();
//
//        dancer.dance();

        Singer[] singers = {
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new FolkSinger(),
                new OperaSinger()
        };

        Dancer[] dancers = {
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new PopMusician(),
                new RockMusician()
        };

        System.out.println("=============================");

        for (int i = 0; i < singers.length; i++) {
            singers[i].sing();
        }

        for (int i = 0; i < dancers.length; i++) {
            dancers[i].dance();
        }

    }
}
