package code.generics.generics2.classes;

public class BoxDemo {
    public static void main(String[] args) {

        Box<Paper> paperBox = new Box<Paper>();
         Box<Plastic> plasticBox = new Box<>();

        paperBox.putItem(new Paper());
        plasticBox.putItem(new Plastic());

        TwoCellBox<Paper, Plastic> paperPlasticTwoCellBox = new TwoCellBox<>();

    }
}
