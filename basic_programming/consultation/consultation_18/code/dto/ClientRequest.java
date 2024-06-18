package code.dto;

public class ClientRequest {
    private String noteText;
    private String description;

    public ClientRequest(String noteText, String description) {
        this.noteText = noteText;
        this.description = description;
    }

    public String getNoteText() {
        return noteText;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ClientRequest{" +
                "noteText='" + noteText + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
