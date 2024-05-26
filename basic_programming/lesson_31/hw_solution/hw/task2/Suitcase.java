package code.practice.hw.task2;

import java.util.Objects;

public class Suitcase {
    enum Material {Plastic,Fabric }
    enum Size { M, L, XL }

    private Material material;
    private Size size;
    private String color;

    public Suitcase(Material material, Size size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suitcase suitcase = (Suitcase) o;
        return material == suitcase.material && size == suitcase.size && Objects.equals(color, suitcase.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, size, color);
    }

    @Override
    public String toString() {
        return "Suitcase{" +
                "material=" + material +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
