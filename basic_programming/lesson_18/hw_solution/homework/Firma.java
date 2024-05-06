package homework;

public class Firma {

   private int id;
   private String name;
   private String companyName;
   private String departmentName;

    public Firma(int id, String name, String companyName, String departmentName) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.departmentName = departmentName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
