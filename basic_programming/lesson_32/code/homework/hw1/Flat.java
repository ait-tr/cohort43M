package code.homework.hw1;

public class Flat implements Comparable<Flat>{
    private Integer bedroom;
    private Double area;

    public Flat(Integer bedroom, Double area) {
        this.bedroom = bedroom;
        this.area = area;
    }

    public Integer getBedroom() {
        return bedroom;
    }

    public Double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "bedroom=" + bedroom +
                ", area=" + area +
                '}';
    }

    @Override
    public int compareTo(Flat otherFlat) {
        if (!this.bedroom.equals(otherFlat.getBedroom())) {
            return Integer.compare(bedroom,otherFlat.bedroom);
        } else {
            return Double.compare(this.area,otherFlat.area);
        }
    }

//    @Override
//    public int compareTo(Flat otherFlat) {
//
//        int compareResult = this.bedroom - otherFlat.getBedroom();
//        if (compareResult == 0) {
//            // compareResult = (int) (this.area - otherFlat.getArea());
//            // так делать не корректно из-за потери данных при приведении типа
//            // т.е. если результат вычисления будет меньше 1 (например 0.9)
//            // то в результате приведения к int мы получим 0
//            compareResult = (int) Math.ceil(this.area - otherFlat.getArea());
//        }
//
//        return compareResult;
//    }
}
