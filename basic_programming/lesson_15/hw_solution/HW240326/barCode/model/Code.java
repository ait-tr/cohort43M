package HW240326.barCode.model;

public class Code {
    private long barcode;

    public Code(long barcode) {
        this.barcode = barcode;
    }

    public long getBarcode() {
        return barcode;
    }

    public int  lengthCode(){
        return Long.toString(barcode).length();
    }
    public int  controlSum(){
        char [] charSum = Long.toString(barcode).toCharArray();
        int intCharSum = 0;
        for (int i = 0; i < charSum.length; i++){
            intCharSum += (int) charSum [i];
        }
        return intCharSum;
    }

    public boolean isValid(){
        return lengthCode() == 8 ? true : lengthCode() == 13 ? true : false;
    }

}
