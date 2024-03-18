public class While {

    public static void main(String[] args) {

       /* System.out.println("In while loop");
        int i = 1;
        while(i<=10){
            System.out.print(i++ + " ");
            //i++;
        }

        System.out.println("\nAfter while");

        System.out.println("decreasing loop");
        i = 10;
        while (i>0){


            System.out.println(i);
            i--;

        */
        int n = 10;
        System.out.println("Sum of 1 to "+ n + " is " + countSum(n));

    }

    public static int countSum(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
        sum = sum + i; // 3
        i++;//2

        }
        return sum;
    }
}


