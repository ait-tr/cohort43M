package code.example2;

import code.library.var1.UserInput;

public class Example3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UserInput userInput = new UserInput();
        UserOutput userOutput = new UserOutput();

        int x = userInput.inputInt("Введите x: ");
        int y = userInput.inputInt("Введите y: ");

        int result = calculator.sum(x,y);

        userOutput.printData(result);
    }
}
