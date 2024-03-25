package HW240325.equation;

import HW240325.equation.model.QuadraticEquation;

import java.util.Arrays;
/*
Task 3.(*) Create a QuadraticEquation class in the equation.model package. In this class,define the fields
private double a;
private double b;
private double c;
Create a constructor public QuadraticEquation(double a, double b, double c) to initialize fields.
Create getters and setters.
Create a public void display() method to print a quadratic equation to the console.
Create methods public double delta() and public int quantityRoots() to calculate the discriminant
and the number of solutions to the equation, respectively.

Create a class EquationAppl in the equation package with the main method.
In the main method, create several instances of QuadraticEquation and print for each
of which are the results of the display, delta, quantityRoots methods.
 */
public class EquationAppl {
    public static void main(String[] args) {

        QuadraticEquation equation1 = new QuadraticEquation(1,4,0);
        equation1.display();
        System.out.println("Delta is: " + equation1.delta());
        System.out.println("Quantity of roots is: " + equation1.quantityRoots());
        System.out.println();

        QuadraticEquation equation2 = new QuadraticEquation(10,4,1);
        equation2.display();
        System.out.println("Delta is: " + equation2.delta());
        System.out.println("Quantity of roots is: " + equation2.quantityRoots());
        System.out.println();

        QuadraticEquation equation3 = new QuadraticEquation(1,40,-5);
        equation3.display();
        System.out.println("Delta is: " + equation3.delta());
        System.out.println("Quantity of roots is: " + equation3.quantityRoots());
        System.out.println();

    }
}
