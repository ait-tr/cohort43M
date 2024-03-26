package HW240326.barCode;

import HW240326.barCode.model.Code;

public class BerCodeAppl {
    public static void main(String[] args) {

        Code barCode1 = new Code(12345618L);
        Code barCode2 = new Code(124567890129L);

        System.out.println("The amount of numbers " + barCode1.getBarcode() + " is: " + barCode1.lengthCode());
        System.out.println("The sum of numbers " + barCode1.getBarcode() + " is: " + barCode1.controlSum());
        System.out.println(barCode1.getBarcode() + " bar code  is valid: " + barCode1.isValid());
        System.out.println();

        System.out.println("The length of numbers " + barCode2.getBarcode() + " is: " + barCode2.lengthCode());
        System.out.println("The sum of numbers " + barCode2.getBarcode() + " is: " + barCode2.controlSum());
        System.out.println(barCode2.getBarcode() + " bar code is valid: " + barCode2.isValid());

    }
}
