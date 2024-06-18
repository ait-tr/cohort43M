package code.repository;

import code.entity.Note;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class NoteRepositoryHashSet implements NoteRepository{

    Set<Note> notes = new HashSet<>();

    @Override
    public Note addNote(Note note) {
        return null;
    }

    @Override
    public Optional<Note> findById(Integer id) {
        return Optional.empty();
    }
}
