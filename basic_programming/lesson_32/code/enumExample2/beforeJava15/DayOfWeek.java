package code.enumExample2.beforeJava15;

public class DayOfWeek {

    private String title;

    private DayOfWeek(String title) {
        this.title = title;
    }

    public static DayOfWeek MONDAY = new DayOfWeek("Понедельник");
    public static DayOfWeek TUESDAY = new DayOfWeek("Вторник");
    //...


}
