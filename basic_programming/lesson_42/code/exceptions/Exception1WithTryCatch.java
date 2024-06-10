package code.exceptions;

import code.library.var1.UserInput;

public class Exception1WithTryCatch {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        int x = userInput.inputInt("Введите первое число: ");
        int y = userInput.inputInt("Введите второе число: ");


        try{
            System.out.println("результат деления " + divide(x,y));
        } catch (Exception e){
            System.out.println("Произошла ошибка " + e.getMessage());
        }

        System.out.println("программа завершила свою работу");

    }

    static double divide(int x, int y){
        return x / y;
    }
}
