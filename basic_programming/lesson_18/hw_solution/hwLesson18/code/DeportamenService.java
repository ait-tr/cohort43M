public class DeportamenService {
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

    public Department createDepartment(Collaborator[] collaborators) {
        String departmentName = ui.inputText("Enter department name: ");
        Collaborator departmentCollaborator = collaborators[0]; // Use the first collaborator in the array
        Department department = new Department(departmentName, departmentCollaborator);
        return department;
    }

    public Company[] createCompany(Collaborator[] collaborators) {
        int departmentsQuantity = ui.inputInt("Enter quantity of departments: ");
        Company[] company = new Company[departmentsQuantity];
        for (int i = 0; i < departmentsQuantity; i++) {
            company[i] = createDepartment(collaborators);
        }
        return company;
    }
}