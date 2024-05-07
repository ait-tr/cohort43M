public class DepartmentService {
    UserInput ui = new UserInput();

    public Collaborator createCollaborator() {
        String familyName = ui.inputText("Enter family name: ");
        String name = ui.inputText("Enter name: ");
        String patronymic = ui.inputText("Enter patronymic: ");
        Collaborator collaborator = new Collaborator(familyName, name, patronymic);
        return collaborator;
    }

    public Collaborator[] createAllCollaboratorsInDepartment() {
        int numberOfCollaboratorsInDepartment = ui.inputInt("Enter number of collaborators in department: ");
        Collaborator[] collaborators = new Collaborator[numberOfCollaboratorsInDepartment];
        for (int i = 0; i < collaborators.length; i++) {
            collaborators[i] = createCollaborator();
        }
        return collaborators;
    }

    public Department createDepartment() {
        Collaborator[] collaborators = createAllCollaboratorsInDepartment();
        String departmentName = ui.inputText("Enter department name: ");
        Department departments = new Department(departmentName, collaborators);
        return departments;
    }
    public Department[] createAllDepartmentsInCompany() {
        int numberOfDepartmentsInCompany = ui.inputInt("Enter number of Departments in company: ");
        Department[] departments = new Department[numberOfDepartmentsInCompany];
        for (int i = 0; i < departments.length; i++) {
            departments[i] = createDepartment();
        }
        return departments;
    }
    public Company createCompany() {
        String companyName = ui.inputText("Enter company name: ");
        Department[] departments = createAllDepartmentsInCompany();
        Company company = new Company(companyName, departments);
        return company;
    }
}
