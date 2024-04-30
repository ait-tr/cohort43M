package code.classExample2;

public class PersonExample {

    public static void main(String[] args) {
        Person person ; // null

        person = new Person();

        person.name = "Ruslan";
        person.age = 32;
        person.isAdult = true;

//        System.out.println("Hello! My name is " + person.name);
//        System.out.println("My age is " + person.age);

        person.greeting();



        Person person2 = new Person();
        person2.name = "Ludmila";
        person2.age = 18;
        person2.isAdult = true;

//        System.out.println("Hello! My name is " + person2.name);
//        System.out.println("My age is " + person2.age);


        person2.greeting();

    }
}
