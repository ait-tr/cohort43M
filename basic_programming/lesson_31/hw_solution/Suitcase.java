package homework_31.Suitcase;

import java.util.Objects;

public class Suitcase implements Comparable<Suitcase> {
    private String material;
    private String size;
    private String color;

    public Suitcase(String material, String size, String color) {
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
        return "Suitcase{" +
                "material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suitcase suitcase = (Suitcase) o;
        return Objects.equals(material, suitcase.material) && Objects.equals(size, suitcase.size) && Objects.equals(color, suitcase.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, size, color);
    }

    @Override
    public int compareTo(Suitcase o) {
        int compareResult = material.compareTo(o.getMaterial());
        if (compareResult == 0) {
            compareResult = size.compareTo(o.getSize());
            if(compareResult == 0){
               return color.compareTo(o.getColor());
            }
        }
        return compareResult;
        }


}

