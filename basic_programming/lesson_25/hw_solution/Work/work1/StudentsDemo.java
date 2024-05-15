package Work.work1;

import java.util.ArrayList;
import java.util.Collections;

public class StudentsDemo {
    public static void main(String[] args) {

    ArrayList<Students> students = new ArrayList<>();
    students.add(new Students("Artur",19,1));
   students.add(new Students("Marina",21,3));
    students.add(new Students("Petr",20,2));
   students.add(new Students("Miki",24,5));
   students.add(new Students("Sem",22,3));

    for (int i = 0; i < students.size(); i++) {
        System.out.println(students.get(i));
    }
    System.out.println("============== В обратном порядке =============");

   Collections.reverse(students);
    for (int i = 0; i < students.size(); i++) {
        System.out.println(students.get(i));

  }
    System.out.println("========== Удаляем одного студента ==========");
    students.remove(1);
    for (int i = 0; i < students.size(); i++) {
        System.out.println(students.get(i));

    }

  }

}
