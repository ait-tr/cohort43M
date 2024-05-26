package homework_31.Suitcase;

import java.util.LinkedList;
import java.util.TreeSet;

public class SuitcaseTreeSet {
    public static void main(String[] args) {

        TreeSet<Suitcase> suitcaseTreeSet = new TreeSet<>();



        suitcaseTreeSet.add(new Suitcase("plastic","M","red"));
        suitcaseTreeSet.add(new Suitcase("rag","L","blue"));
        suitcaseTreeSet.add(new Suitcase("metallic","XL","black"));
        suitcaseTreeSet.add(new Suitcase("plastic","L","orange"));
        suitcaseTreeSet.add(new Suitcase("rag","M","green"));

        LinkedList<Suitcase> suitcaseLinkedList = new LinkedList<>(suitcaseTreeSet);


        for(Suitcase suitcase : suitcaseTreeSet){
            System.out.println(suitcase);
        }
        System.out.println("=================================================");
        for (Suitcase suitcase:suitcaseLinkedList) {
            System.out.println(suitcase);

        }


    }

}
