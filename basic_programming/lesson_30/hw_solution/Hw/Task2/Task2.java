package code.Hw.Task2;

import javax.swing.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(2);
        numbers.add(6);
        numbers.add(9);
        numbers.add(7);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        Set<Integer> uniqNumbers = new HashSet<>(numbers);
        System.out.println("List numbers: " + numbers);
        System.out.println("Unique numbers: " + uniqNumbers);
    }
}
