package hwlesson21.Inheritiance.task3;

public class Demo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bill", "James");
        Employee employee2 = new Employee("Robert", "Williams");
        String[] projects = {"Cat", "Dog", "Perrot"};
        Developer developer1 = new Developer("Haus", "Nill",projects);
        Employee[] employees = {employee1,employee2, developer1};
        Manager manager = new Manager("Caddy", "Collings", employees);
        System.out.println("Employee1 :" + "\n" + employee1);
        System.out.println();
        System.out.println("Developer \n" + developer1);
        System.out.println();
        System.out.println(manager);
    }
}
