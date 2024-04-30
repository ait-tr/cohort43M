package string;

public class CodeExample1 {
    public static void main(String[] args) {

        String str1 = "Text";

       // System.out.println(str1);

        String str2 = "Text";

        String str3 = new String("Text");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));


        str1 = str1 + " новый текст";

        System.out.println(str1);



    }
}
