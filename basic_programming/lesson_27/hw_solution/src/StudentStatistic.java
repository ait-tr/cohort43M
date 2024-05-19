import java.util.HashMap;
import java.util.Map;

public class StudentStatistic {
    public static void main(String[] args) {
        Map<String, Double> studentGrade = new HashMap<>();
        studentGrade.put("Alex", 3.9);
        studentGrade.put("Maria", 4.5);
        studentGrade.put("Ivan", 4.2);
        studentGrade.put("Elena", 3.8);
        studentGrade.put("Peter", 4.0);

        System.out.println(studentGrade);
        System.out.println("Изменили средний балл у Алекс на 4.1:");
        studentGrade.put("Alex", 4.1);
        System.out.println(studentGrade);


    }




}
