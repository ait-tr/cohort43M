package code.homework.hw2;

import java.util.*;

public class SuitCaseDemo {
    public static void main(String[] args) {
        SuitCase sc1 = new SuitCase("fabric","XL","black");
        SuitCase sc2 = new SuitCase("plastic","M","yellow");
        SuitCase sc3 = new SuitCase("plastic","L","black");
        SuitCase sc4 = new SuitCase("fabric","XL","blue");
        SuitCase sc5 = new SuitCase("plastic","M","grey");
        SuitCase sc6 = new SuitCase("fabric","L","black");
        SuitCase sc7 = new SuitCase("plastic","XL","grey");
        SuitCase sc8 = new SuitCase("fabric","L","red");
        SuitCase sc9 = new SuitCase("plastic","M","green");
        SuitCase sc10 = new SuitCase("fabric","M","black");


        Set<SuitCase> suitCaseSet = new TreeSet<>(new CompareByAllParameters());

        suitCaseSet.add(sc1);
        suitCaseSet.add(sc2);
        suitCaseSet.add(sc3);
        suitCaseSet.add(sc4);
        suitCaseSet.add(sc5);
        suitCaseSet.add(sc6);
        suitCaseSet.add(sc7);
        suitCaseSet.add(sc8);
        suitCaseSet.add(sc9);
        suitCaseSet.add(sc10);

        System.out.println(suitCaseSet);


        List<SuitCase> suitCaseList = new LinkedList<>();

        suitCaseList.add(sc1);
        suitCaseList.add(sc2);
        suitCaseList.add(sc3);
        suitCaseList.add(sc5);
        suitCaseList.add(sc6);
        suitCaseList.add(sc4);
        suitCaseList.add(sc7);
        suitCaseList.add(sc8);
        suitCaseList.add(sc10);
        suitCaseList.add(sc9);

        System.out.println("==============");
        System.out.println(suitCaseList);

        System.out.println("==============");
        Collections.sort(suitCaseList,new CompareByAllParameters());
        System.out.println(suitCaseList);

    }
}
