package code.junit.src.test.java;

import code.junit.src.main.java.LetterCountFromText;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCountFromTextTest {

    LetterCountFromText countFromText = new LetterCountFromText();

    @Test
    void testCountLetter(){
        assertEquals(3, countFromText.countLetter("Hello World"));
    }

    @Test
    void testCountLetterZero(){
        assertEquals(0, countFromText.countLetter("Hbnhtrjwx"));
    }

    @Test
    void testCountLetterEmpty(){
        assertEquals(0, countFromText.countLetter(""));
    }


}