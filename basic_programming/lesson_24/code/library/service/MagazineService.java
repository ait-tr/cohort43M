package code.library.service;

import code.library.entity.Magazine;
import code.library.repository.MagazineRepository;

public class MagazineService {

    private MagazineRepository repository;

    public MagazineService(MagazineRepository repository) {
        this.repository = repository;
    }

    public boolean addMagazine(Magazine magazine) {

        if (magazine.getId() > 0
                && magazine.getIssueYear() > 0
                && !magazine.getTitle().isBlank()
                && magazine.getIssueNumber() > 0) {
            boolean addResult = repository.add(magazine);
            return addResult;
        } else {
            return false;
        }
    }

    public Magazine findById(int id){
        return repository.findById(id);
    }

    public Magazine findByTitle(String title){
        return repository.findByTitle(title);
    }


}
