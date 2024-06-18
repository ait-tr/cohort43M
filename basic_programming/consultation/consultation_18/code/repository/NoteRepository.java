package code.repository;

import code.entity.Note;

import java.util.Optional;

public interface NoteRepository {

    public Note addNote(Note note);

    public Optional<Note> findById(Integer id);

}
