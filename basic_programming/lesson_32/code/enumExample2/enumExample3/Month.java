package code.enumExample2.enumExample3;

public enum Month {
    JANUARY("Январь", 31),
    FEBRUARY("Февраль", 28),
    MARCH("Март", 31),
    APRIL("Апрель", 30),
    MAY("Май", 31),
    JUNE("Июнь", 30),
    JULY("Июль", 31),
    AUGUST("Август", 31),
    SEPTEMBER("Сентябрь", 30),
    OCTOBER("Октябрь", 31),
    NOVEMBER("Ноябрь", 30),
    DECEMBER("Декабрь", 31);

    private String title;
    private int daysCount;

    Month(String title, int daysCount) {
        this.title = title;
        this.daysCount = daysCount;
    }

    public static Month[] getWinterMonth() {
        return new Month[] {DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month[] getSummerMonth() {
        return new Month[] {JUNE, JULY, AUGUST};
    }

    public String getTitle() {
        return title;
    }

    public int getDaysCount() {
        return daysCount;
    }

    @Override
    public String toString() {
        return "Month{" +
                "title='" + title + '\'' +
                ", daysCount=" + daysCount +
                '}';
    }
}
