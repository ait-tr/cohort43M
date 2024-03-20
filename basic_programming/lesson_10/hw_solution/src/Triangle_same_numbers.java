public class Triangle_same_numbers {
    public static void main(String[] args) {
        printTriangle(7);

    }

    public static void printTriangle(int n){
        int i = 1;
        while (i <= n)
        {
            int j = 1;
            while (j <= i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

/*
Написать метод, выодящий на экран треугольник из одинаковых цифр в строке такого вида:
1
22
333
 */
