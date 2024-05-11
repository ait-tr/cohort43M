package Shape;

public abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

}
