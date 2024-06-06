package task2_Compare;

import java.util.*;

public class SuitcaseDemo {
    //Чемодан - 3 параметра материал (пластик или ткань), размер - M, L, XL и цвет.
    // Создать две коллекции - TreeSet и LinkedList и отсортировать по трем параметрам - размеру и
    // материалу и цвету
    public static void main(String[] args) {
        Suitcase sc1 = new Suitcase("black", "fabric", "M");
        Suitcase sc2 = new Suitcase("blue", "fabric", "XL");
        Suitcase sc3 = new Suitcase("red", "plastic", "M");
        Suitcase sc4 = new Suitcase("blue", "plastic", "XL");
        Suitcase sc5 = new Suitcase("red", "fabric", "M");
        Suitcase sc6 = new Suitcase("blue", "plastic", "M");



        Set<Suitcase> suitcaseSet = new TreeSet<>(new CompareByAll());

        suitcaseSet.add(sc1);
        suitcaseSet.add(sc2);
        suitcaseSet.add(sc3);
        suitcaseSet.add(sc4);
        suitcaseSet.add(sc5);
        suitcaseSet.add(sc6);
        for(Suitcase suitcase : suitcaseSet){
        System.out.println(suitcase);
        }

        List<Suitcase> suitcaseList = new LinkedList<>();
        suitcaseList.add(sc1);
        suitcaseList.add(sc2);
        suitcaseList.add(sc3);
        suitcaseList.add(sc4);
        suitcaseList.add(sc5);
        suitcaseList.add(sc6);

        System.out.println("*************************************");
        for(Suitcase suitcase : suitcaseList){
        System.out.println(suitcase);
        }
        System.out.println("______после сортировки_______________");

        //Collections.sort(suitcaseList, new CompareByAll());
        suitcaseList.sort(new CompareByAll());
        for(Suitcase suitcase : suitcaseList){
        System.out.println(suitcase);
        }



    }
}
