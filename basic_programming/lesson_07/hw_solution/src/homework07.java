public class homework07 {
    public static void main(String[] args) {
        double far = 57.6;
        double c = conf (far);
        int a = 2;
        int b = 2;
        int result = mySum(a,b);
        System.out.println("Sum " + result);
        mySun(a,b);
        System.out.println(c);
    }
    public static void mySun (int a, int b){
        System.out.println(a + b);
    }
    public static int mySum (int a, int b){
        return a + b;
    }
    public static double conf (double far){
        double result = 5 * (far - 32) / 9;
        return result;

    }


}
