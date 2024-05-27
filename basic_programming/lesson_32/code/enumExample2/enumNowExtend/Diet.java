package code.enumExample2.enumNowExtend;

public class Diet {
    public void takeLunch(DayOfWeekExtend day){
        switch (day) {
            case MONDAY :
                System.out.println(day.getTitle());
                System.out.println("Куриная лапша.");
                break;

            case SUNDAY:
                System.out.println(day.getTitle());
                System.out.println("Воскресный обед! Можно себе позволить немного сладкого!");
                break;
        }
    }
}
