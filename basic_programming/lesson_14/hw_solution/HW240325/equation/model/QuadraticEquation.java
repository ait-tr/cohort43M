package HW240325.equation.model;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    Scanner scanner = new Scanner(System.in);

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a + "x^2" +
                ", b=" + b + "x" +
                ", c=" + c +
                '}';
    }

    public void display(){
        System.out.println("** The quadratic equation is:");
        System.out.println(a + "x^2 " + mathSign(b) + " " + b + "x " + mathSign(c) + " " + Math.abs(c));
    }

    public double delta (){
        return b * b - 4 * a * c;
    }

    public char mathSign (double variable) {
        char mathSign = '-';
        if (variable >=0) {
            mathSign = '+';
        }
        return mathSign;
    }

    public int quantityRoots(){
        int quantityRoots = 2;
        if (delta() < 0) {
            quantityRoots = 0;
        } else if (delta() == 0) {
            quantityRoots = 1;
        }
        return quantityRoots;
    }
}
