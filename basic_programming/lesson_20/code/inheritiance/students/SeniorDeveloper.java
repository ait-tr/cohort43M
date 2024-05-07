package code.inheritiance.students;

public class SeniorDeveloper extends MiddleDeveloper{

    void mentoring() {
        System.out.println("Mentoring");
    }

    void solveProblem() {
        System.out.println("problem solver");
    }

    @Override
    void code() {
        System.out.println("Simple coding");
    }

    @Override
    void learn() {
        System.out.println("Fast learning");
    }
}
