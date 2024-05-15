package code.dynamicArrayStructure;

import java.util.Arrays;

public class DasExample {
    public static void main(String[] args) {
        Das das = new Das();

        String[] strings = new String[10];

        strings = das.addNewElement(strings, "Text1");
        strings = das.addNewElement(strings, "Text2");
        strings = das.addNewElement(strings, "Text3");
        strings = das.addNewElement(strings, "Text4");
        strings = das.addNewElement(strings, "Text5");
        strings = das.addNewElement(strings, "Text6");
        strings = das.addNewElement(strings, "Text7");
        strings = das.addNewElement(strings, "Text8");
        strings = das.addNewElement(strings, "Text9");
        System.out.println(strings);
        strings = das.addNewElement(strings, "Text10");

        System.out.println(strings);

        strings = das.addNewElement(strings, "Text11");

        System.out.println(strings);

        System.out.println(Arrays.toString(strings));

        strings = das.addNewElement(strings, "Text12");

        System.out.println(strings);

        System.out.println(Arrays.toString(strings));
    }
}
