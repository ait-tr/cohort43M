package homework_18;

public class CompanyService {

    UserInput ui = new UserInput();
    public Company createCompany(){
        int idEmployee = ui.inputInt("Enter id of employee: ");
        String firstName = ui.inputText("Enter first Name of employee: ");
        String lastName = ui.inputText("Enter last name of employee: ");

        Employee companyEmployee = new Employee(idEmployee,firstName,lastName);

        String companyName = ui.inputText("Enter name of company:");
        int depNumber = ui.inputInt("Enter number of department: ");
        String depName = ui.inputText("Enter name of department: ");

        Company myCompany = new Company(companyName,depNumber,depName,companyEmployee);
        return myCompany;
    }

    public Company[] createList(){
        int totalEmployees = ui.inputInt("Enter quantity: ");

        Company[] companies = new Company[totalEmployees];
        for (int i = 0; i < totalEmployees; i++){
            companies[i] = createCompany();
        }
        return companies;
    }
    }





