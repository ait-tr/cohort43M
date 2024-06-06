package code.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<Integer> optionalI = Optional.ofNullable(1);

        if (optionalI.isPresent()){
            System.out.println("Значение = " + optionalI.get());
        }


        optionalI.ifPresent(value -> System.out.println("Значение = " + value));


        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        integers.removeIf(collectionElement -> collectionElement % 2 == 0);

        System.out.println(integers);


//        for (int i = 0; i < integers.size(); i++) {
//            if (integers.get(i) % 2 == 0){
//                integers.remove(i);
//            }
//        }
//        System.out.println(integers);





    }
}
