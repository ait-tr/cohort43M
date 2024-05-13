package code.arraysAndloop;

public class Ball {

    private String form;
    private String color;
    private String message;

    public Ball(String form, String color, String message) {
        this.form = form;
        this.color = color;
        this.message = message;
    }

    public String getForm() {
        return form;
    }

    public String getColor() {
        return color;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "form='" + form + '\'' +
                ", color='" + color + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
