package task_1;

public class StringToUpperCase {
    //Напишите функциональный интерфейс для преобразования строки в верхний регистр
    public static void main(String[] args) {
        String originalStr = "hello world";
        IupperCase converter = (String input) -> input.toUpperCase();
        String upperCaseStr = converter.upperCase(originalStr);
        System.out.println("Оригинальная строка: " + originalStr);
        System.out.println("Строка в верхнем регистре: " + upperCaseStr);
    }
}
