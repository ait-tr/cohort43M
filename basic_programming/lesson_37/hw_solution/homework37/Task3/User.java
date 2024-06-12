package code.homework37.Task3;

public class User {
    private String id;
    private String name;
    private String familyName;

    public User(String id, String name, String familyName) {
        this.id = id;
        this.name = name;
        this.familyName = familyName;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }
}
