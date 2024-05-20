package Homework.dict;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        Map<EngWords,Translation>mapDictionary = new HashMap<>();
        mapDictionary.put(new EngWords("dream"),new Translation("мечта","видение","сон"));
        mapDictionary.put(new EngWords("wood"),new Translation("дерево","лес","роща"));
        mapDictionary.put(new EngWords("flier"),new Translation("мечта","видение","сон"));
        mapDictionary.put(new EngWords("box"),new Translation("ящик","бокс","сундук"));
        mapDictionary.put(new EngWords("shell"),new Translation("оболочка","панцирь","корпус"));

        System.out.println(mapDictionary);

    }
}
