package Inheritans.ver2;

public abstract class  Shape {
    private String title;
    private int id;

    public Shape(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }
    public abstract double calcArea();

    }

