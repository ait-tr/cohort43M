package code.task2.service;

public interface Serviceable {

    void assignWork(String typeWorkDescription);
    String getWorkStatus();
    void changeWorkStatus(String newStatus);

}
