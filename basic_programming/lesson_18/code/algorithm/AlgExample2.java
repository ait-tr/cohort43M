package code.algorithm;

public class AlgExample2 {
    public static void main(String[] args) {
        int[] arr = new int[1000];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            //... что-то надо сделать
            for (int j = i; j < arr.length; j++) {
                count++;
            }
        }

        System.out.println("Общее количество итераций = " + count);

    }
}
