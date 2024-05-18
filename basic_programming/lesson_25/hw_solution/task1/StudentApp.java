package homework.task1;

import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {


        ArrayList<Student> names = new ArrayList<>();

        names.add(new Student("Roman"));
        names.add(new Student("Marina"));
        names.add(new Student("Nina"));
        names.add(new Student("Makar"));
        names.add(new Student("Kate"));

        System.out.println(names);

        for (int i = names.size() -1; i >=0; i-- ){
            System.out.println(names.get(i));
        }

        names.remove(3);
        System.out.println(names);
    }
}
