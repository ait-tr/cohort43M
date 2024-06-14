package code.exampleApplicationStructure.backEnd.service;

import code.exampleApplicationStructure.backEnd.entity.Cat;
import code.exampleApplicationStructure.backEnd.repository.CatRepositoryInterface;

public class PrintCatService {

    private CatRepositoryInterface repository;

    public PrintCatService(CatRepositoryInterface repository) {
        this.repository = repository;
    }

    public void printData(){
        System.out.println("Список котов и кошек:");
        for (Cat cat : repository.findAll()){
            System.out.println("Кличка кота / кошки :" + cat.getName());
        }
    }
}
