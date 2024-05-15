package code.arrayList;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("First");
        stringArrayList.add("Second");
        stringArrayList.add("Third");

        System.out.println(stringArrayList);

        stringArrayList.clear();

        System.out.println(stringArrayList);

        stringArrayList.add(0, "First");
        System.out.println(stringArrayList);
        stringArrayList.add(0,"Second");
        System.out.println(stringArrayList);
        stringArrayList.add(0, "Third");

        System.out.println(stringArrayList);

        stringArrayList.remove(0);
        System.out.println(stringArrayList);

        stringArrayList.remove("First");
        System.out.println(stringArrayList);


        stringArrayList.set(0,"New Second Element");
        System.out.println(stringArrayList);


    }
}
