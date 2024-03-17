public class Main07 {

    public static void main(String[] args) {
        double result;

        result= calculateGrad(100);
        System.out.println("Grad Celsus is " + result);


       int result1 = sum(5,9);
       System.out.println("Summa is " + result1);





    }

    public static double calculateGrad(double far){
        double celcus = 5 * ( far - 32)/9;
        return celcus;

    }

    public static int sum (int a, int b){
       int sum = a+b;
       return sum;

    }
}
