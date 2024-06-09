package homework_39.task1;


public class ConvertToUpperCase {
    public static void main(String[] args) {

        UpperCaseConverter converter = (input) -> input.toUpperCase();


        String original = "Let me say smth in capital letter";
        String converted = converter.convert(original);

        System.out.println(original);
        System.out.println(converted);

    }

}
