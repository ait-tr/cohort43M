package Equation;

import Equation.model.QuadraticEquation;

public class QuadraticEquationAppl {
    public static void main(String[] args) {
        QuadraticEquation equation1 = new QuadraticEquation(4, -3, 7);
        QuadraticEquation equation2 = new QuadraticEquation(3, 5, 12);
        QuadraticEquation equation3 = new QuadraticEquation(1, -4, 4);

        System.out.println("Equation 1:");
        equation1.display();
        System.out.println("Delta: " + equation1.delta());
        System.out.println("Number of roots: " + equation1.quantityRoots());

        System.out.println("\nEquation 2:");
        equation2.display();
        System.out.println("Delta: " + equation2.delta());
        System.out.println("Number of roots: " + equation2.quantityRoots());

        System.out.println("\nEquation 3:");
        equation3.display();
        System.out.println("Delta: " + equation3.delta());
        System.out.println("Number of roots: " + equation3.quantityRoots());
    }
}

