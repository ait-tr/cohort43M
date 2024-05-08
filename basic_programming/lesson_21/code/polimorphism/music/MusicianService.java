package code.polimorphism.music;

public class MusicianService {

    public void singAll(Singer[] singers){
        for (int i = 0; i < singers.length; i++) {
            singers[i].sing();
        }
    }

    public void danceAll(Dancer[] dancers){

        for (int i = 0; i < dancers.length; i++) {
            dancers[i].dance();
        }
    }

}
