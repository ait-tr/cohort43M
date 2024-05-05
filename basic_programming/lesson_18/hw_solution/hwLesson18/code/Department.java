public class Department {
    private String departmentName;
    private Collaborator collaborator;

    public Department(String departmentName, Collaborator collaborator) {
        this.departmentName = departmentName;
        this.collaborator = collaborator;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Collaborator getCollaborator() {
        return collaborator;
    }

    @Override
    public String toString() {
        return "Department{" +
                "Name='" + departmentName + '\'' +
                ", Collaborator=" + collaborator +
                '}';
    }
}
