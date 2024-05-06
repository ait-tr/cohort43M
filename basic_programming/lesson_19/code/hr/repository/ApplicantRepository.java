package code.hr.repository;

import code.hr.entity.Applicant;

import java.util.Arrays;

public class ApplicantRepository {
    private Applicant[] applicants;

    public ApplicantRepository(Applicant[] applicants) {
        this.applicants = applicants;
    }
// ======= НЕ ДЕЛАЕМ GETTER !!! =======
//    public Applicant[] getApplicants() {
//        return applicants;
//    }
    /**
     * CRUD
     * - create
     * - read (find)
     * - update
     * - delete
     */


    public void add(Applicant applicant) {
        for (int i = 0; i < applicants.length; i++) {
            if (applicants[i] == null) {
                applicants[i] = applicant;
                return;
            }
        }
        System.out.println("База данных переполненна!");
    }

    public Applicant findByName(String name){
        for (int i = 0; i < applicants.length; i++) {
            if (applicants[i].getPerson().getName().equals(name)) {
                return applicants[i];
            }
        }
        return null;
    }

    public Applicant findById(int id){
        for (int i = 0; i < applicants.length; i++) {
            if (applicants[i].getId() == id) {
                return applicants[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ApplicantRepository{" +
                "applicants=" + Arrays.toString(applicants) +
                '}';
    }
}
