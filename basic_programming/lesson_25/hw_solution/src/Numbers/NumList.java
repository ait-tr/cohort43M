package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class NumList {
    public static void main(String[] args) {
        ArrayList<Num> nums = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(100);
            nums.add(new Num(randomNum));
            System.out.println(nums.get(i));

        }

        int maxNum = nums.get(0).getDigit();
        int minNum = nums.get(0).getDigit();

        for (int i = 1; i < nums.size(); i++){
        int currentNum = nums.get(i).getDigit();
        if(currentNum > maxNum){  maxNum = currentNum; }
        if(currentNum < minNum){  minNum = currentNum; }
        }
        System.out.println("Максимальное число: " + maxNum);
        System.out.println("Минимальное число: " + minNum);

        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = 0; j < (nums.size() - 1 -i); j++) {
                if (nums.get(j).getDigit() > nums.get(j + 1).getDigit()) {

                    Num temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
                }
            }

        }
        System.out.println("Отсортированный список: " + nums);
    }
}
