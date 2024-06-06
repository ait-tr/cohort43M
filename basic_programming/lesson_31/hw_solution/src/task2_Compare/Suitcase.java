package task2_Compare;

public class Suitcase {
    private String color;
    private String material;
    private String size;

    public Suitcase(String color, String material, String size) {
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public String getColor() { return color;}

    public String getMaterial() {return material;}

    public String getSize() {return size;}

    @Override
    public String toString() {
        return "Suitcase{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
