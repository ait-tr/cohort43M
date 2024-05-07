import java.util.Arrays;

public class Department {
    String departmentName;
    Collaborator[] collaborators;

    public Department(String departmentName, Collaborator[] collaborators) {
        this.departmentName = departmentName;
        this.collaborators = collaborators;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Collaborator[] getCollaborator() {
        return collaborators;
    }

    @Override
    public String toString() {
        return "Department{" +
                "Name='" + departmentName + '\'' +
                ", Collaborator=" + Arrays.toString(collaborators) +
                '}';
    }
}
