public class NestedLoop {

    public static void main(String[] args) {
        //  внешний цикл
        for( int i = 0; i <=5; i++){ //0

            //внутренний цикл
            for( int j = 0; j <= 5; j++){ //0
                System.out.println("i = " + i + " ,j = " + j);
            }
            System.out.println();
        }

        System.out.println("Our Multiplication Table");
        System.out.println();
        printTable();
    }

    public static void printTable(){

        int i = 1;
        while (i < 10)
        {

           int j = 1;
           while (j < 10){
               System.out.println(i + "*" + j + " = " + j*i);
               j++;
           }
            System.out.println("**************************");
           i++;
        }
    }

}
