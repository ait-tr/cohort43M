package code.generics.practice.tasks;

class GenericCalculator1<T extends Number> {


    public Double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }


    public Double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

     public Double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public Double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }

}