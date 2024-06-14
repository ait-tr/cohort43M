package code.example5.service;

import code.example5.entity.Cat;
import code.example5.repository.CatRepositoryInterface;

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
