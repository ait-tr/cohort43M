package HW_31.task_2;

import java.util.Objects;

public class Suitcase implements Comparable<Suitcase> {
    public enum Material {
        PLASTIC, FABRIC
    }

    public enum Size {
        M, L, XL
    }

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

    @Override
    public int compareTo(Suitcase other) {
        int sizeCompare = this.size.compareTo(other.size);
        if (sizeCompare != 0) {
            return sizeCompare;
        }

        int materialCompare = this.material.compareTo(other.material);
        if (materialCompare != 0) {
            return materialCompare;
        }

        return this.color.compareTo(other.color);
    }
}

