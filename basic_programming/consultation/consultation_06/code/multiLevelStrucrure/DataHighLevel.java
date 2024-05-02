package code.multiLevelStrucrure;

public class DataHighLevel {

    int idHiLevel;

    DataMiddleLevel dataMiddleLevel;

    public DataHighLevel(int idHiLevel, DataMiddleLevel dataMiddleLevel) {
        this.idHiLevel = idHiLevel;
        this.dataMiddleLevel = dataMiddleLevel;
    }

    @Override
    public String toString() {
        return "DataHighLevel{" +
                "idHiLevel=" + idHiLevel +
                ", dataMiddleLevel=" + dataMiddleLevel +
                '}';
    }
}
