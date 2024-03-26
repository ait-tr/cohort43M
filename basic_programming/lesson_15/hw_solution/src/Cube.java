public class Cube {
    private int a;

    public Cube(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public int perimeter(){
        return 12 * a;

    }
    public int square(){
        return 6 * a * a;
    }
    public int volume(){
        return a * a * a;
    }
}
