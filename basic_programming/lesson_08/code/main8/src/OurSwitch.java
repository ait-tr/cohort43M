public class OurSwitch {

    /*
    Switch

    switch(expression) // переменная, контролирующая switch  может быть одного из следующих типов:
                            int, byte, short, char, String
     case constant1:
       statements
       break;

     case constant2:
       statements
       break;

     case constant3:
       statements
       break;
       .
       .
       .
     default  // определяет действия в случае если ни одна из констант не соответствует выражению в круглых скобках

     */

    public static void main(String[] args) {
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = scanner.nextInt();

        switch (i){
            case 45:
                System.out.println("i is 45");
                break;

            case 1:
                System.out.println("i is one");
                break;

            case 30:
                System.out.println("i is thirty");
                break;

            case 5:
                System.out.println("i is five");
                break;

            default:
                System.out.println("i is another number");
        }

      */


        char ch = 'b';

        switch (ch){

            case 'b':
              //  System.out.println("Case b");
              //  break;

            case 'a':
                System.out.println("Case a or Case b");
                break;

            case 'y':
                System.out.println("Case y");
             //   break;

            default:
                System.out.println("Wrong letter");
                System.out.println();

        }
    }

}
