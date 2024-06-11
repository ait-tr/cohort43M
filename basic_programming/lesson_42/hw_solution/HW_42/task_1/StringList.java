package HW_42.task_1;

import java.util.List;

public class StringList {
    private String string;
    private List<String> listOfStrings;

    public StringList(String string, List<String> listOfStrings) {
        this.string = string;
        this.listOfStrings = listOfStrings;
    }

    public String getString() {
        return string;
    }

    public List<String> getListOfStrings() {
        return listOfStrings;
    }

    @Override
    public String toString() {
        return "StringList{" +
                "string='" + string + '\'' +
                ", listOfStrings=" + listOfStrings +
                '}';
    }
}
