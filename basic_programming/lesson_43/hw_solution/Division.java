package HomeWork.Task1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Введите делимое число: ");
            double x = sc.nextDouble();

            System.out.println("Введите делитель число: ");
            double y = sc.nextDouble();

            double result = divide(x,y);
            System.out.println("Результат деления равен: "+ result);
        }catch (ArithmeticException e){
            System.out.println("Ошибка: Деление на ноль невозможно. ");
        }
        catch (Exception e){
            System.out.println("Ошибка: Некорректный ввод.");
        }finally {
            sc.close();
        }
    }
    public static double divide(double x,double y) throws ArithmeticException{
        if(y==0){
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return x/y;
    }
}
