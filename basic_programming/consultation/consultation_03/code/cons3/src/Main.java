public class Main {

    public static double calculateArea(double radius){

       // double area = Math.PI * radius * radius;
       // System.out.println("Circle area is " + area);
       // double perimeter = 2 * Math.PI * radius;
        return Math.PI * radius * radius; // 700
       // return perimeter;
    }
    public static void main(String[] args) {

        double result;
        double radius = 15.0;
        result = calculateArea(radius); //700
        result = calculateArea(20.0);
        calculateArea(30.0);

        System.out.println(result);

        /* Написать метод для перевода дюймов в метры. Один дюйм это 0.025 метра

    }

    /*


    [модификаторы]    тип_возвращаемого_значения  имя_метода( [параметры] )
    {
     // тело метода

     [return]
    }
     */
    }


}
