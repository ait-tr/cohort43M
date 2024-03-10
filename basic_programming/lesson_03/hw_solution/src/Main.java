public class Main {
    public static void main(String[] args) {
        /*Задача 1.
Написать программу, выводящую на экран результат деления двух чисел 25 и 3.
Результат не должен быть округлен до целых.
Посчитать также остаток от деления этих чисел.*/
double a=25; double b=3;
double c=a/b;
String uslovie= "Uslovie: 1.Skolko budet a delit na b, esli a=25, b=3? " +
        "2.Kakoy ostatok celöchislennogo delenia?";
String rest = "Ostatok=";
String reschenie= "c=a/b=";
System.out.println("Zadanie 1");
System.out.println(uslovie);
System.out.println(reschenie+c);
System.out.println(rest + (a%b));

/*Задача 2.
Написать программу, выводящую на экран значение переменной типа инт в квадрате.
 Предварительно обьявите эту переменную и задайте ее значение.
( Возведение в квадрат равносильно умножению числа на себя)*/
  int x; x=25;
  int x2= x*x;
  String resultat="x2=";
  System.out.println("Zadanie 2");
  System.out.println("Vivesti na ekran znachenie x v kvadrate, esli x="+ x);
  System.out.println(resultat+x2);

    }
}
