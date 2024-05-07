package code.inheritiance.students;

public class StudentDemo {
    public static void main(String[] args) {

        Student student = new Student();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

        System.out.println("============== STUDENT =============");
        student.learn();


        System.out.println("============== JUNIOR =============");

        juniorDeveloper.learn();
        juniorDeveloper.code();

        System.out.println("============== MIDDLE =============");

        middleDeveloper.learn();
        middleDeveloper.code();
        middleDeveloper.debug();

        System.out.println("============== SENIOR =============");

        seniorDeveloper.learn();
        seniorDeveloper.code();
        seniorDeveloper.debug();
        seniorDeveloper.mentoring();
        seniorDeveloper.solveProblem();

        System.out.println("============== MENTOR =============");


        Mentor mentor = new Mentor();
        mentor.debug();
        //mentor.specialForMentor();

    }
}
