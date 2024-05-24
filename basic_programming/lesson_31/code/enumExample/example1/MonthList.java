package code.enumExample.example1;

import java.util.ArrayList;
import java.util.List;

public class MonthList {
    List<Month> months = new ArrayList<>();

    public void addNewMonth(String monthName){
        months.add(new Month(monthName));
    }
}
