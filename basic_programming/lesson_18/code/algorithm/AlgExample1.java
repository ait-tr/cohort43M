package code.algorithm;

public class AlgExample1 {
    public static void main(String[] args) {
        int[] arr = new int[1000];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            //... что-то надо сделать
            for (int j = 0; j < arr.length; j++) {
                count++;
            }
        }

        System.out.println("Общее количество итераций = " + count);

    }
}
