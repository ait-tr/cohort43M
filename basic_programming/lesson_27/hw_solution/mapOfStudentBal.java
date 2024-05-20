package Homework.Students;

import java.util.HashMap;
import java.util.Map;

public class mapOfStudentBal {

    public static void main(String[] args) {

        Map<Students,BalOfStudent> mapStudent = new HashMap<>();

        mapStudent.put(new Students("Oleg"),new BalOfStudent(96.3));
        mapStudent.put(new Students("Taras"),new BalOfStudent(97.0));
        mapStudent.put(new Students("Olga"),new BalOfStudent(91.8));
        mapStudent.put(new Students("Tumyr"),new BalOfStudent(89.0));
        mapStudent.put(new Students("Alex"),new BalOfStudent(90.6));
        mapStudent.put(new Students("Anton"),new BalOfStudent(80.0));
        mapStudent.put(new Students("Petr"),new BalOfStudent(98.5));


        BalOfStudent serbal = mapStudent.get("Petr");
        System.out.println(serbal);

        System.out.println(mapStudent);
    }



}
