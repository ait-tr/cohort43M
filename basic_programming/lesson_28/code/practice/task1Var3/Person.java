package code.practice.task1Var3;

public class Person {

    private Integer personId;
    private String name;
    private String address;
    private String personalCode;

    public Person(Integer personId, String name, String address, String personalCode) {
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.personalCode = personalCode;
    }

    public Integer getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", personalCode='" + personalCode + '\'' +
                '}';
    }
}
