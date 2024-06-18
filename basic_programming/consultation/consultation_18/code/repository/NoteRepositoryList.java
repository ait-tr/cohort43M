package code.repository;

import code.entity.Note;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NoteRepositoryList implements NoteRepository{

    private List<Note> notes;
    private Integer counter = 0;

    public NoteRepositoryList() {
        this.notes = new ArrayList<>();
    }

    @Override
    public Note addNote(Note note) {
        note.setId(++counter);
        notes.add(note);
        return note;
    }

    @Override
    public Optional<Note> findById(Integer id) {

        return notes.stream()
                .filter(note -> note.getId().equals(id))
                .findFirst();
    }
}
