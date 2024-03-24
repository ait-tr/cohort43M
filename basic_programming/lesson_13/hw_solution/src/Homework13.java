public class Homework13 {


/*
        public static int calculateStringLength(String input) {
            return input.length();
        }

        public static void main(String[] args) {


            String inputString = "Guten Tag";
            int length = calculateStringLength(inputString);
            System.out.println("Length of the string is: " + length);

        }

 */
public  static String mergeAndUpper(String str1, String str2) {
    return (str1 + str2).toUpperCase();
}
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "There";
        String result = mergeAndUpper(str1, str2);
        System.out.println(result);




        }


    }

