package code.task2.service;

public class Painting implements Serviceable{

    private String typeWorkDescription;
    private String workStatus;


    public Painting(String typeWorkDescription) {
        this.typeWorkDescription = typeWorkDescription;
        this.workStatus = "Start painting";
    }

    @Override
    public void assignWork(String typeWorkDescription) {
        this.typeWorkDescription = typeWorkDescription;
        this.workStatus = "In progress";
    }

    @Override
    public String getWorkStatus() {
        return typeWorkDescription + " : " + workStatus;
    }

    @Override
    public void changeWorkStatus(String newStatus) {
        workStatus = newStatus;
    }
}
