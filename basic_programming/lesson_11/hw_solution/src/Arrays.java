public class Arrays {


    public static void main(String[] args) {
        System.out.println("Ints array");
        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 10;
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.println("ints[ " + i + " ] = " + ints[i]);
        }
        System.out.println("Names array");
        String[] names = {"John", "Mary", "Ann", "Peter"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[ " + i + " ] = " + names[i]);
        }
        names[1] = "Kate";

        System.out.println("With Kate");
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[ " + i + " ] = " + names[i]);
        }

        names[names.length - 1] = "Tom";
        names[names.length - 2] = "Jack";

        System.out.println("With Tom and Jack");
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[ " + i + " ] = " + names[i]);
        }
        String[] newNames = new String [names.length + 2];
        for (int i = 0; i < names.length; i++){
            newNames [i] = names[i];
        }
        System.out.println("newNames");
        for (int i = 0; i < newNames.length; i++) {
            System.out.println("newNames[ " + i + " ] = " + newNames[i]);
        }


        newNames[newNames.length - 1] = "Ben";
        newNames[newNames.length - 2] = "Jim";
        System.out.println("newNames");
        for (int i = 0; i < newNames.length; i++) {
            System.out.println("newNames[ " + i + " ] = " + newNames[i]);
        }

        System.out.println("Print max");
        int [] array = {4, 10, 2, 50, 7};
        findMax(array);
    }

    public static void findMax(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}