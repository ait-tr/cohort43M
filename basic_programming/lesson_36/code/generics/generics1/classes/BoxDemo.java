package code.generics.generics1.classes;

import java.util.ArrayList;
import java.util.List;

public class BoxDemo {
    public static void main(String[] args) {

        // --- без generics ----
        BoxForPaper classicBoxForPaper = new BoxForPaper();
        BoxForPlastic classicBoxForPlastic = new BoxForPlastic();

        // ------ with generics ------

        Box<Paper> paperBox = new Box<Paper>();
        // type inference - выведение типа
        // <> - diamond operator

        Box<Plastic> plasticBox = new Box<>();

        Box<Glass> glassBox = new Box<>();


        paperBox.putItem(new Paper());
        plasticBox.putItem(new Plastic());

        TwoCellBox<Paper, Plastic> paperPlasticTwoCellBox = new TwoCellBox<>();
        TwoCellBox<Plastic, Glass> plasticGlassTwoCellBox = new TwoCellBox<>();


    }
}
