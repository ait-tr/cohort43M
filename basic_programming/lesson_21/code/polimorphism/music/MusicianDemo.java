package code.polimorphism.music;

public class MusicianDemo {
    public static void main(String[] args) {
        RockMusician musician = new RockMusician();
        Singer singer = musician;
        Dancer dancer = musician;

        musician.greeting();
        musician.dance();
        musician.sing();

        Musician[] musicians = {musician};

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

       MusicianService service = new MusicianService();

       service.singAll(singers);
       service.danceAll(dancers);

    }
}
