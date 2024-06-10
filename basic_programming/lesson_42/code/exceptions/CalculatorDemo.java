package code.exceptions;

import code.library.var1.UserInput;
import code.staticExample.exampl1.nonStatic.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        UserInput userInput = new UserInput();

        // ----------------------------------

        while (true) {

            System.out.println("Деление x на y:");

           try{
               int x = userInput.inputInt("Input x: ");
               int y = userInput.inputInt("Input y: ");
               double result = calculator.divide(x, y);

               System.out.println("Результат деления = " + result);

           } catch (Exception e){
               System.out.println("Произошла ошибка: " + e.getMessage());
           }
              }


    }
}
