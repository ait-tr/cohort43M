package code.stringOperation;

public class StringBuilderMethodsExample {
    public static void main(String[] args) {

        String numbers = "0123456789";

        StringBuilder sb = new StringBuilder(numbers);

        System.out.println(sb);

        System.out.println(sb.substring(3)); // 3456789

        System.out.println(sb.substring(4,8)); // 4567

        System.out.println(sb.replace(3,6,"ABCDEFGH")); // 0123456789 -> 012ABCDEFGH6789


        sb = new StringBuilder(numbers);

        System.out.println(sb.reverse());

        sb.reverse();

        System.out.println(sb.delete(5,9)); // 012349
        System.out.println(sb.deleteCharAt(1)); // 02349


        System.out.println(sb.insert(1, "One")); // 0One2349


    }
}
