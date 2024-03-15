public class Main {


    public static void main(String[] args) {

        int x = 10; //  видна во всем методе main


        if( x == 10){ // новый блок

                int y = 25; // видна только в этом блоке
          //   x и y  видны в этом блоке
            x = y * 4;
            System.out.println( " x = " + x +" ,y = " + y);
        }

       int y = 200;


    }

    // The scope of variables  область видимости переменных
    {


    }
}
