package code.var1.service;

import code.var1.entity.Author;
import code.var1.repository.AuthorRepository;

public class AuthorService {

    private AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public void addNewAuthor(Author author) {
        repository.add(author);
    }

    public Author findById(Integer authorId){
        return repository.findById(authorId);
    }

    public Author findByName(String authorName){
        return repository.findByName(authorName);
    }

}
