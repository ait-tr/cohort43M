import java.util.ArrayList;

public class StudentDatabase {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();


        studentArrayList.add(new Student("Ivan Ivanov", "Marketing", 223344));
        studentArrayList.add(new Student("Petr Petrov", "Economics", 123123));
        studentArrayList.add(new Student("Vlad Vlasov", "Management", 445565));
        studentArrayList.add(new Student("Inna Malinina", "Sociology", 4567890));
        studentArrayList.add(new Student("Anna Rybalko", "Psychology", 223344));


        System.out.println(studentArrayList);
        studentArrayList.clear();

        System.out.println("==========================================");

        studentArrayList.add(0,new Student("Ivan Ivanov", "Marketing", 223344));
        studentArrayList.add(0,new Student("Petr Petrov", "Economics", 123123));;
        studentArrayList.add(0,new Student("Vlad Vlasov", "Management", 445565));
        studentArrayList.add(0,new Student("Inna Malinina", "Sociology", 4567890));
        studentArrayList.add(0,new Student("Anna Rybalko", "Psychology", 223344));

        System.out.println(studentArrayList);

        System.out.println("==========================================");

        studentArrayList.remove(2);
        System.out.println(studentArrayList);
    }
}
