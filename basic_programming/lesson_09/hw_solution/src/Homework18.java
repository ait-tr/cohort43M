public class Homework18 {

    public static void main(String[] args) {
printCube(2);
printMulti(8);
    }

    static public void printCube(int n){
        int a = 1;
        while (a <= n){
            System.out.println(a + " cubed " + a*a*a);
            a++;
        }
    }

    static public void printMulti(int n){
        int b = 0;
        while (b >= 0 && b <=n){
            System.out.println(b*n );
            b++;
        }
    }
}
