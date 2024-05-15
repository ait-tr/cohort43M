package homework_25;

import java.util.ArrayList;

public class StudentData {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Roman", 1,18));
        students.add(new Student("Rita", 2,19));
        students.add(new Student("Ruslan", 3,18));
        students.add(new Student("Rawshan", 4,20));
        students.add(new Student("Rurik", 5,22));


        System.out.println(students);

        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }

        System.out.println("================================");


        for (int i = students.size()-1; i>=0; i--){
            System.out.println(students.get(i));
        }

        System.out.println("================================");

        students.remove(1);
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }

    }




}
