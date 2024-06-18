package code.service;

import code.dto.ClientRequest;
import code.entity.Note;
import code.repository.NoteRepository;

public class NoteService {

    private NoteRepository repository;

    public NoteService(NoteRepository repository) {
        this.repository = repository;
    }

    public boolean addNewNote(ClientRequest request){
        String text = request.getNoteText();
        String description = request.getDescription();
        Integer id = 0;

        // мы могли бы проверить корректность этих данных
        // и если они не валидны, то выдать пользователю соответсвующее сообщение

        Note newNote = new Note(id,text,description);
        Note savedNote = repository.addNote(newNote);

        if (savedNote.getId() > 0) {
            return true;
        } else {
            return false;
        }

    }

}
