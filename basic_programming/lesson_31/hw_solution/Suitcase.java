package code.Homework.Task2;
import java.util.*;

class Suitcase implements Comparable<Suitcase> {
    enum Material {PLASTIC, FABRIC}

    enum Size {M, L, XL}

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

    @Override
    public String toString() {
        return "Suitcase{" +
                "material=" + material +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {

        LinkedList<Suitcase> suitcases = new LinkedList<>();
        suitcases.add(new Suitcase(Suitcase.Material.PLASTIC, Suitcase.Size.M, "Red"));
        suitcases.add(new Suitcase(Suitcase.Material.FABRIC, Suitcase.Size.L, "Blue"));
        suitcases.add(new Suitcase(Suitcase.Material.PLASTIC, Suitcase.Size.XL, "Green"));
        suitcases.add(new Suitcase(Suitcase.Material.FABRIC, Suitcase.Size.M, "Yellow"));
        suitcases.add(new Suitcase(Suitcase.Material.PLASTIC, Suitcase.Size.L, "Black"));
        suitcases.add(new Suitcase(Suitcase.Material.FABRIC, Suitcase.Size.L, "Blue"));

        TreeSet<Suitcase> suitcaseTree = new TreeSet<>(suitcases);

        suitcases.sort(Comparator.naturalOrder());

        System.out.println("\nLinkedList<Suitcase>:");
        for (Suitcase suitcase : suitcases) {
            System.out.println(suitcase);
        }
        System.out.println("\nTreeSet<Suitcase> удаляет дубль чемодана:");
        for (Suitcase suitcase : suitcaseTree) {
            System.out.println(suitcase);
        }
    }
}