package code.polimorphism.overloading;

public class OverloadingExample {

    // Overloading - перегрузка метода

    public void printData(){
        System.out.println("Метод печатает значения по умолчанию!");
    }

    public void printData(String message){
        System.out.println(message);
    }

    public void printData(String message, int number){
        System.out.println(message);
        System.out.println("Значение параметра = " + number);
    }
}
