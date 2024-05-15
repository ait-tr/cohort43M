package code.arrayListPrctice;

public class TV {
    private String manufacturer;
    private Integer size;

    public TV(String manufacturer, Integer size) {
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "TV{" +
                "manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                '}';
    }
}
