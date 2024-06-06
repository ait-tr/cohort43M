package task_3;

import java.util.ArrayList;
import java.util.List;

public class MergRes {
    public static void main(String[] args) {
        //Напишите функциональный интерфейс для объединения двух списков в один
        ListMerger<Integer> listMerger = (list1, list2) ->{
            List<Integer> mergedList = new ArrayList<>(list1);
            mergedList.addAll(list2);
            return mergedList;
        } ;
        List<Integer> listF = new ArrayList<Integer>();
        listF.add(2);
        listF.add(6);
        listF.add(10);

        List<Integer> listS = new ArrayList<Integer>();
        listS.add(4);
        listS.add(6);
        listS.add(10);
        List<Integer> res = listMerger.listMerg(listF,listS);

        System.out.println(res);
    }
}
