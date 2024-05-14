package code.library.repository;

import code.library.entity.Book;
import code.library.entity.Magazine;

public class MagazineRepository {
    private Magazine[] magazines;
    private int count = 0;

    public MagazineRepository(int sizeOfMagazines) {
        this.magazines = new Magazine[sizeOfMagazines];
    }

    public void add(Magazine magazine) {
        if (count < magazines.length){
            magazines[count++] = magazine;
        }
    }


    public Magazine findByTitle(String titleForSearch){
        for (int i = 0; i < count; i++) {
            if (magazines[i].getTitle().equals(titleForSearch)){
                return magazines[i];
            }
        }
        return null;
    }

    public Magazine findById(int idForSearch){
        for (int i = 0; i < count; i++) {
            if (magazines[i].getId() == idForSearch){
                return magazines[i];
            }
        }
        return null;
    }

    public Magazine[] findByYear(int yearForSearch){
        Magazine[] magazinesSearchResult = new Magazine[count];
        int searchCount = 0;
        for (int i = 0; i < count; i++) {
            if (magazines[i].getIssueYear() == yearForSearch){
                magazinesSearchResult[searchCount] = magazines[i];
                searchCount++;
            }
        }
        return magazinesSearchResult;
    }

}
