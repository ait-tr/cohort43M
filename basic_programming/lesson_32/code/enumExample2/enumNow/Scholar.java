package code.enumExample2.enumNow;

public class Scholar {

    private ScholarSchedule schedule;
    private boolean goToSchool;

    public Scholar(ScholarSchedule schedule) {
        this.schedule = schedule;
    }

    public void wakeUp(){
        if (this.schedule.getDayOfWeek() == DayOfWeek.SUNDAY ||
                this.schedule.getDayOfWeek() == DayOfWeek.SATURDAY) {
            System.out.println("В школу не идем! Спим дальше!");
        } else {
            System.out.println("Опять в школу! Ну еще 5 минуточек!!!");
        }
    }
}
