public class Homework6 {

    public static void main (String[]args){

        int a= 3;
        int b = 3;
        int sum = a + b;
        if (a == b){
            sum=sum*2;
        }
        System.out.println(sum);



        //2
        int x = 2;
        int y = 2;
        int z =2;

        if (x == y && x == z){
            System.out.println("All numbers are equal");
        }
        else if ((x == y)|| (x == z) || (z == y)) {
            System.out.println("Some numbers are equel");
        }
        else{
            System.out.println("All numbers are different");
        }



    }



}





