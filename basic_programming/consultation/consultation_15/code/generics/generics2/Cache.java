package code.generics.generics2;

import java.util.List;

public class Cache <T>{

    private List<T> list;

    public Cache(List<T> list) {
        this.list = list;
    }

   public void addElement(T element){
        list.add(element);
   }

   public void printList(){
        for (T element : list){
            System.out.println(element);
        }
   }

    @Override
    public String toString() {
        return "Cache{" +
                "list=" + list +
                '}';
    }
}
