package code.das;

public class Das {

    public String[] addNewElement(String[] array, String newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = newElement;
                return array;
            }
        }

        String[] increasedArray = increaseArray(array);
        increasedArray[increasedArray.length - 1] = newElement;

        return increasedArray;
    }


    private String[] increaseArray(String[] oldArray){
        String[] newArray = new String[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

}
