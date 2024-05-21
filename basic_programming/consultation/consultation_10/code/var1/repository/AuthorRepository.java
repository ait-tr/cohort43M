package code.var1.repository;

import code.var1.entity.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {

    private List<Author> authors = new ArrayList<>();

    public void add(Author newAuthor){
        authors.add(newAuthor);
    }

    public Author findById(Integer authorId){
        for (Author author : authors){
            if (authorId == author.getAuthorId()) {
                return author;
            }
        }
        return null;
    }


}
