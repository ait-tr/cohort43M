package Variant3;

import java.util.Objects;

public class Employee {
    private String name;
    private String FamilyName;
    private String role;
    private String department;

    public Employee(String name, String familyName, String role, String department) {
        this.name = name;
        this.FamilyName = familyName;
        this.role = role;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
