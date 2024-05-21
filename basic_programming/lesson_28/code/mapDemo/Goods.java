package code.mapDemo;

public class Goods {
    private Integer code;
    private String name;
    private Double price;

    public Goods(Integer code, String name, Double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getFirstDigitOfCode(){
        String codeStringFormat = Integer.toString(this.code);
        return Character.getNumericValue(codeStringFormat.charAt(0));
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
