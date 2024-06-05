package homework_39.Task4;

public class FactorialDemo {
    public static void main(String[] args) {

        FactorialCalculator factorialCalculator = n ->{
            long result = 1;
            for(long i=1; i<=n; i++){
                result *=i;
            }
            return result;
        };
        long [] testNumbers ={1,2,5,8,10};

        for(long num : testNumbers){
            long result = factorialCalculator.calculate(num);
            System.out.println("Factorial of " + num + " is " + result);
        }


    }
}
