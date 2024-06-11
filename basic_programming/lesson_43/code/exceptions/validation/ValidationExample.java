package code.exceptions.validation;

import code.library.var1.UserInput;

public class ValidationExample {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        String userName = userInput.inputText("Введите имя пользователя: ");

        boolean checkResult = checkUserName(userName);

        if (checkResult) {
            System.out.println("Проверка прошла успешно");
        } else {
            System.out.println("Проверка не пройдена");
        }

    }

    static boolean checkUserName(String userName){
        if (userName.length() < 3) return false;
        if (userName.length() > 15) return false;
        if (userName.contains("&")) return false;

        return true;

    }
}
