package Inheritans.ver2;

public class Triangle extends Shape{
    private double height;
    private double site;

    public Triangle(String title, int id, double height, double site) {
        super(title, id);
        this.height = height;
        this.site = site;
    }

    public double getHeight() {
        return height;
    }

    public double getSite() {
        return site;
    }

    @Override
    public double calcArea() {
        return 0.5 * height * site;
    }


}
