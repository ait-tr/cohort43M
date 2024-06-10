package code.person;

import java.util.List;

public class Ability {
   private String title;

    public Ability(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Ability{" +
                "title='" + title + '\'' +
                '}';
    }
}
