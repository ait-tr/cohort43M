package code;

import code.repository.NoteRepository;
import code.repository.NoteRepositoryList;
import code.service.NoteService;

public class App {
    public static void main(String[] args) {
        NoteRepository repository = new NoteRepositoryList();
        NoteService service = new NoteService(repository);


    }
}
