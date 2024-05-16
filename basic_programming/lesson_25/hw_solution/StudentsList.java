//Управление списком студентов:
//
//Создайте ArrayList для хранения имен студентов.
//Добавьте в список пять имен студентов.
//Выведите список студентов в обратном порядке.
//Удалите студента из списка по индексу и выведите обновленный список.


import java.util.ArrayList;

public class StudentsList {
    public static void main(String[] args) {


        ArrayList<Students> StudentsNames = new ArrayList<>();

        StudentsNames.add(new Students("Иван Иванов"));
        StudentsNames.add(new Students("Иван Петров"));
        StudentsNames.add(new Students("Петр Иванов"));
        StudentsNames.add(new Students("Петр Петров"));
        StudentsNames.add(new Students("Сидоров"));

        for (int i =0; i < StudentsNames.size();  i++ ) {
            System.out.println(StudentsNames.get(i));
        }

        int indexForDelete = 4;

       StudentsNames.remove(indexForDelete);

        System.out.println("***Студент с индексом " + indexForDelete + " удален***");

        for (int i =0; i < StudentsNames.size();  i++ ) {
            System.out.println(StudentsNames.get(i));
        }

    }
}
