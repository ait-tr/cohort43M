public class Main {
    public static void main(String[] args) {
        /*
        1.Пусть цена товара А обычно составляет 1000 евро, а товара В - 500 евро. Если клиент покупает товары вместе,
        то на них будет действовать скидка 100 евро на всю покупку. Написать программу, выводящую на экран переменную,
        которая соответствует стоимости А и В со скидкой. Отдельно выведите на экран сумму скидки от этой покупки

        */

        int priceA = 1000;
        int priceB = 500;
        int discount = 100;
        int result = priceA + priceB -discount;

        System.out.println("The final price is " + result);
        System.out.println("Discount is " + discount);

        /*

        2. Напишите программу для подсчета длины окружности и площади круга. Задайте несколько различных значений
        радиуса и напечатайте результат.
        формула для подсчета длины окружности 2*pi*r
        pi = 3.14

        площадь круга считается по формуле pi * radius *radius

         */

        double pi = 3.14;
        double radius = 5;
        double perimeter = 2 * pi * radius;
        System.out.println(perimeter);

        double area = pi * radius * radius;
        System.out.println(area);

      //  System.out.println(Math.PI);
    }
}
