import java.util.Scanner;

public class Collaborator {
    String familyName;
    String name;
    String patronymic;

    public Collaborator(String familyName, String name, String patronymic) {
        this.familyName = familyName;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return "Collaborator{" +
                "Family name='" + familyName + '\'' +
                ", Name='" + name + '\'' +
                ", Patronymic='" + patronymic + '\'' +
                '}';
    }
}
