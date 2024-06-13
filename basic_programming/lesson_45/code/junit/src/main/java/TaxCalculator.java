package code.junit.src.main.java;

public class TaxCalculator {

    public double calculateTax(double income){

        double tax;

        if (income < 0 ) return 0;

        if (income <= 20000){
            return income * 0.25;
        } else {
            return 5000 + (income - 20000) * 0.4;
        }

    }
}
