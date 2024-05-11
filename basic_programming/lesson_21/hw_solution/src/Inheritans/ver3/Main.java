package Inheritans.ver3;

public class Main {
    public static void main(String[] args) {
        String[] project = {"JavaScript", "Java", "C++"};
        Developer developer = new Developer("Mark", "London", 001,project);
        Developer developer1 = new Developer("Jack", "Li", 002,project);
        Developer developer2 = new Developer("Ivan", "Tybik", 003,project);
        Employee[] employees = {developer, developer1, developer2};
        Manager manager = new Manager("John","Black",004, employees);
        System.out.println(manager);
    }
}
