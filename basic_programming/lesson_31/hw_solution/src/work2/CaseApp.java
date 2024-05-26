package work2;

import java.util.TreeSet;

public class CaseApp {
    public static void main(String[] args) {
        TreeSet<Case> caseTreeSet = new TreeSet<>();

        caseTreeSet.add(new Case("Plastic","1-M","Red"));
        caseTreeSet.add(new Case("Textile","2-L","Yellow"));
        caseTreeSet.add(new Case("Plastic","3-XL","Blue"));
        caseTreeSet.add(new Case("Textile","1-M","Grey"));
        caseTreeSet.add(new Case("Textile","1-M","Black"));
        caseTreeSet.add(new Case("Plastic","3-XL","Pink"));

        caseTreeSet.forEach(System.out::println);
    }
}
