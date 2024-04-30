public class Work2 {
    public static void main(String[] args) {
        int numberOne = 34;
        int numberTwo = 12;
        int numberThree = 88;
        int numberFour = 74;

        System.out.println("1 : " + numberOne);
        System.out.println("2 : " + numberTwo);
        System.out.println("3 : " + numberThree);
        System.out.println("4 : " + numberFour);

        int maxNumbers = Math.max(Math.max(numberOne, numberTwo), Math.max(numberThree, numberFour));
        System.out.println("Max number is " + maxNumbers);
    }
}
