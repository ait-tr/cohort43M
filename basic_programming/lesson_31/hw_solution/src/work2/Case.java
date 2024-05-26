package work2;

public class Case implements Comparable<Case>{
    private String material;
    private String size;
    private String color;

    public Case(String material, String size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Case{" +
                "material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Case object) {
        int materialResult = material.compareTo(object.material);
        if (materialResult == 0){
            materialResult = size.compareTo(object.size);
        }
        if (materialResult == 0) {
            materialResult = color.compareTo(object.color);
        }

        return materialResult;
    }
}
