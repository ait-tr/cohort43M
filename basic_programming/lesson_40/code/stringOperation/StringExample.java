package code.stringOperation;

public class StringExample {
    public static void main(String[] args) {

        String s1 = "one";
        String s2 = "one";
        String s3 = new String("one");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);



        String str1 = "string 1";
        System.out.println(str1);

        str1 = str1 + " add";
        System.out.println(str1);
    }
}
