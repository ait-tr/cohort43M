package code.task1;

import java.util.Arrays;

public class TeaTypes {

    private String[] arrayTeaTypes = {"black","green", "herbal", "fruits"};

    public String[] getArrayTeaTypes() {
        return arrayTeaTypes;
    }

    @Override
    public String toString() {
        return "TeaTypes{" +
                "teaTypes=" + Arrays.toString(arrayTeaTypes) +
                '}';
    }
}
