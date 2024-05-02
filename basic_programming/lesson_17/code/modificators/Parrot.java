package code.modificators;

public class Parrot {

    private String name;

    public Parrot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void changeName(String newName){
        if (newName.equals("")) {
            System.out.println("Ошибка ввода имени");
        } else {
           name = newName;
        }
        }

}
