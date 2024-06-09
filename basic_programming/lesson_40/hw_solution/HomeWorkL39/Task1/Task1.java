package HomeWorkL39.Task1;

public class Task1 {
    //Напишите функциональный интерфейс для преобразования строки в верхний регистр.
    public static void main(String[] args) {

        UpperCaseConverter converter = (input) -> input.toUpperCase();

        String original = "good, morning!";
        String upperCased = converter.convert(original);


        System.out.println("Original: " + original);
        System.out.println("Upper case: " + upperCased);
    }
}
