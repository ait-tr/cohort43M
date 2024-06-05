package homework_39.Task1;

public class UpperCaseConversion {
    public static void main(String[] args) {

        Conversion toUpperCase = str -> str.toUpperCase();

        String original = "hight way to hell";

        String conversionStr = toUpperCase.conversionString(original);

        System.out.println(original);
        System.out.println(conversionStr);


    }
}
