public class Main {
    public static void main(String[] args) {

        int n = 3;
        System.out.println("Cube is ");
        printCube(n);

        System.out.println("Number is ");
        number(n);
    }

    public static void printCube (int n){

        int i = 1;
        while (i <=n){
            System.out.println(i * i * i);
            i++;
        }
    }

    public static void number (int n){

        int j = 0;
        while (j <=n){
            System.out.println(j * n);
            j++;
        }
    }
}
