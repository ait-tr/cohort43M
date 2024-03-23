public class Main {
    public static void main(String[] args) {
        System.out.println("The length of word hello is: " + StringLenght("hello"));
        System.out.println("First word is Hello, second word is there. In capital letters is: " + TwoStringInOneUppercase("hello", "there"));
    }
    public static int StringLenght(String str){
        return str.length();
    }
    public static String TwoStringInOneUppercase(String string1, String string2){
        return string1.toUpperCase().concat(string2.toUpperCase());
    }
}