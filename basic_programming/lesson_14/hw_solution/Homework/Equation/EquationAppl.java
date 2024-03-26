package Equation;

import Equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        QuadraticEquation q1 = new QuadraticEquation(2,3,4);
        QuadraticEquation q2 = new QuadraticEquation(2,-3,4);
        QuadraticEquation q3 = new QuadraticEquation(2,3,-4);

        System.out.println("Equation 1:");
        q1.display();
        System.out.println("Delta: " + q1.delta());
        System.out.println("Quantity of roots: " + q1.quantityRoots());

        System.out.println("Equation 2:");
        q2.display();
        System.out.println("Delta: " + q2.delta());
        System.out.println("Quantity of roots: " + q2.quantityRoots());

        System.out.println("Equation 3:");
        q3.display();
        System.out.println("Delta: " + q3.delta());
        System.out.println("Quantity of roots: " + q3.quantityRoots());

    }
}
