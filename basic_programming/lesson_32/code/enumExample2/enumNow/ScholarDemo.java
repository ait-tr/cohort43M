package code.enumExample2.enumNow;

public class ScholarDemo {
    public static void main(String[] args) {
        ScholarSchedule schedule = new ScholarSchedule();
        schedule.setDayOfWeek(DayOfWeek.MONDAY);
        Scholar scholar = new Scholar(schedule);


        scholar.wakeUp();
    }
}
