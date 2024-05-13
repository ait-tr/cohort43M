package code.arraysAndloop;

public class Celebration {

    public static void main(String[] args) {

        Ball ballRedHeart = new Ball("Heart", "Red", "I love you");
        Ball ballDarkBlueClassic = new Ball("Classic", "Dark Blue", "Cloud");
        Ball ballSilverStar = new Ball("Star", "Silver", "Happy Birthday");
        Ball ballRedClassic = new Ball("Classic", "Red", "Cloud");
        Ball ballLightBlueClassic = new Ball("Classic", "Light Blue", "Cloud");


        Ball[] balls = {
                ballRedHeart,ballRedHeart,ballRedHeart,
                ballDarkBlueClassic,ballDarkBlueClassic,
//                ballDarkBlueClassic,ballDarkBlueClassic,
                ballSilverStar,ballSilverStar,
                ballRedClassic,ballRedClassic,
     //           ballLightBlueClassic,ballLightBlueClassic,
       //         ballLightBlueClassic,ballLightBlueClassic,
                ballLightBlueClassic,ballLightBlueClassic
        };

//        for (int i = 0; i < balls.length; i++) {
//            System.out.println("Цвет шарика: " + balls[i].getColor() + " форма: " + balls[i].getForm());
//        }

        // ----- алгоритм перемешивания -------

        for (int i = balls.length - 1; i > 0 ; i--) {
            int randomIndex = (int) (Math.random() * (i - 1));
            Ball temp = balls[randomIndex];
            balls[randomIndex] = balls[i];
            balls[i] = temp;
        }

//        System.out.println("======== перемешали все шарики ======");
//        for (int i = 0; i < balls.length; i++) {
//            System.out.println("Цвет шарика: " + balls[i].getColor() + " форма: " + balls[i].getForm());
//        }


        // --------- отсортируем по цвету ----------

        String[] colors = {  "Silver", "Red", "Light Blue", "Dark Blue"};

        boolean notSorted = true;
        Ball temp;

        printBallsArray(balls);
        System.out.println();

        while (notSorted) {

            notSorted = false;

            for (int i = 0; i < balls.length - 1; i++) {
                int colorNumberBallCurrent = -1;
                int colorNumberBallNext = -1;

                for (int j = 0; j < colors.length; j++) {
                    if (colors[j].equals(balls[i].getColor())) {
                        colorNumberBallCurrent = j;
                    }
                    if (colors[j].equals(balls[i+1].getColor())) {
                        colorNumberBallNext = j;
                    }
                }

                if (colorNumberBallCurrent > colorNumberBallNext){
                    printBallsArray(balls);
                    System.out.println();
                    temp = balls[i];
                    balls[i] = balls[i +  1];
                    balls[i + 1] = temp;
                    notSorted= true;
                }
            }
        }

        printBallsArray(balls);
//        System.out.println("-------- отсортировали все шарики --------");
//        for (int i = 0; i < balls.length; i++) {
//            System.out.println("Цвет шарика: " + balls[i].getColor() + " форма: " + balls[i].getForm());
//        }

    }

    public static void printBallsArray(Ball[] balls){
        for (int i = 0; i < balls.length; i++) {
            System.out.print(balls[i].getColor() + ", ");
        }
    }
}
