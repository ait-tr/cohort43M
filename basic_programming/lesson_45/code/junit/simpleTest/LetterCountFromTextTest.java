package code.junit.simpleTest;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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