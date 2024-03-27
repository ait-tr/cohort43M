package cube;

public class Cube {
    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public int perimeter(int side){
        int p = 4 * side;
        return p;
    }
    public int square(int side){
        int s = side * side*6;
        return s;
    }
public int volume(int side){
        int v = side * side * side;
        return v;
}
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}';
    }
}
