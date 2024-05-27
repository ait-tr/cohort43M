package code.enumExample2.enumNowExtend;

public enum DayOfWeekExtend {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String title;

    DayOfWeekExtend(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "DayOfWeekExtend{" +
                "title='" + title + '\'' +
                '}';
    }
}
