public class Ternary {

    public static void main(String[] args) {

        int age = 15;

        if( age >= 18){
       //     System.out.println("Can vote");
        }
        else{
       //     System.out.println("Can't vote");
        }

        boolean isAdult = age >= 18 ? true : false;
        System.out.println(isAdult);

        String isAdultStr = age >= 18 ? "Can vote" : "Can't vote";
        System.out.println(isAdultStr);

        int number = 11;
        String isEven = number % 2 == 0 ? "Even number" : "Odd number";

        int num = -10;
        int num1 = 0;
        int abs = num >= 0 ? num : -num;
        int min = num <= num1 ? num : num1;
    }
}
