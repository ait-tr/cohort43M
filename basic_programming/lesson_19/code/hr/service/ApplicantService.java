package code.hr.service;


import code.hr.entity.Applicant;
import code.hr.entity.Person;
import code.hr.repository.ApplicantRepository;
import code.library.var1.UserInput;

public class ApplicantService {

    private ApplicantRepository applicantRepository;

    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public void addNewApplicant() {
        UserInput ui = new UserInput();
        int newApplicantId = ui.inputInt("Введите номер соискателя: ");
        String newApplicantName = ui.inputText("Введите имя соискателя: ");
        String newApplicantSpeciality = ui.inputText("Введите специальность соискателя: ");

        Person person = new Person(newApplicantName, newApplicantSpeciality);
        Applicant newApplicant = new Applicant(newApplicantId, person, false);

        applicantRepository.add(newApplicant);

    }

    public Applicant findById(int applicantId){
        return applicantRepository.findById(applicantId);
    }


}
