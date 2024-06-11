package code.exceptions.userExceptions.validation;

import code.library.var1.UserInput;

public class ValidationExample {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        Integer userName = userInput.inputInt("Введите возраст пользователя: ");

        try {
            checkUserName(userName);
            System.out.println("Проверка прошла успешно");
        } catch (MyPersonalExceptionClass e) {
            System.out.println(e.getMessage());
        }

    }

    static void checkUserName(Integer userAge){
        if (userAge < 0) throw new MyPersonalExceptionClass("Возраст меньше 0");
        if (userAge > 100) throw new MyPersonalExceptionClass("Возраст больше 100");

    }
}
