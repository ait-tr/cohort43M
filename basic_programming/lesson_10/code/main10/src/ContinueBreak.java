public class ContinueBreak {

    // Break  в циклах
    public static void main(String[] args) {
        for( int i = 0; i < 10; i++){

            if( i == 6){
                break;
            }

            System.out.println(i);


        }

        System.out.println("After for");

        // continue -  когда программа встречает continue  происходит переход к началу следующей итерации цикла,
        // при этом оставшиеся после continue  команды в текущей итерации пропускаются

        System.out.println("Continue example");

        for( int i = 0; i < 10; i++){

            if( i == 6){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("Continue with while");
        int j = 0;

        while( j < 10){

            if(j == 6){
                j++;
                continue;
            }

            System.out.println(j);
            j++;
        }


    }
}
