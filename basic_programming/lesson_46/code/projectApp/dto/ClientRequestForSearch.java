package code.projectApp.dto;

public class ClientRequestForSearch <T> {

    private T findParam;

    public ClientRequestForSearch(T findParam) {
        this.findParam = findParam;
    }

    public T getFindParam() {
        return findParam;
    }

    @Override
    public String toString() {
        return "ClientRequestForSearch{" +
                "findParam=" + findParam +
                '}';
    }
}
