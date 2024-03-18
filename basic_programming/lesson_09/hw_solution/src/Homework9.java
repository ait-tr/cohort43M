public class Homework9 {
    public static void main(String[] args) {
      /*  int n = 5;
printCube (n);
    }
//------------1----------------
    public static void printCube(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i * i * i);
            i++;


        }

    }

       */
        int n = 5;
        printMultiplication(n);
    }
    //------------2------------------
public static void printMultiplication(int n){
int i = 0;

while(i <= n){
    int result = n*i;
    System.out.println(n + " * " + i + " = " + result);
    i++;
}


    }


}



