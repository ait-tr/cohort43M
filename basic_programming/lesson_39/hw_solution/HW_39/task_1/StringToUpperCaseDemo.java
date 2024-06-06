package HW_39.task_1;

public class StringToUpperCaseDemo {
    public static void main(String[] args) {
        StringToUpperCase stringToUpperCase = (a) -> a.toUpperCase();

        String initialString = "Es ist ein schöner Tag!";
        String convertString = stringToUpperCase.convert(initialString);

        System.out.println("Original String: " + initialString);
        System.out.println("Upper Case String: " + convertString);
    }
}
