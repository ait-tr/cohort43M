package code.entity;

public class Note {
    private Integer id;
    private String noteText;
    private String description;

    public Note(Integer id, String noteText, String description) {
        this.id = id;
        this.noteText = noteText;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoteText() {
        return noteText;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", noteText='" + noteText + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
