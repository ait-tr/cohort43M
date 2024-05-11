package Inheritans.ver2;

public class Rectangle extends Shape{
    private int siteA;
    private int siteB;

    public Rectangle(String title, int id, int siteA, int siteB) {
        super(title, id);
        this.siteA = siteA;
        this.siteB = siteB;
    }

    public int getSiteA() {
        return siteA;
    }

    public int getSiteB() {
        return siteB;
    }

    @Override
    public double calcArea() {
        return siteA * siteB;
    }
}
