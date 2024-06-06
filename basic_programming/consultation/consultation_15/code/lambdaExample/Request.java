package code.lambdaExample;

public class Request {
    private String message;
    private int code;

    public Request(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Request{" +
                "message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}
