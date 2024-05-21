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
            if (authorId.equals(author.getAuthorId())) {
                return author;
            }
        }
        return null;
    }

    public Author findByName(String authorName){
        for (Author author : authors){
            if (authorName.equals(author.getAuthorName())) {
                return author;
            }
        }
        return null;
    }


}
