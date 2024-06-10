package code.exceptions;

public class FinallyExample {
    public static void main(String[] args) {
        int number = getNumber();
        System.out.println(number);
    }

    private static int getNumber() {
        int x = 0;

        try {
            x = x  +  10;
            return x;
        } catch (Exception e){
            return 2;
        } finally {
            System.out.println("Отработал блок finally");;
        }
    }
}
