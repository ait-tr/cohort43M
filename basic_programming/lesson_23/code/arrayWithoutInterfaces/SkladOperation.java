package code.arrayWithoutInterfaces;

import code.library.var1.UserInput;

import java.util.Arrays;

public class SkladOperation {

    public void operations(UserInput ui, Sklad sklad) {
        sklad.fillSklad();
        String searchName = ui.inputText("Введите название для поиска: ");
        System.out.println(Arrays.toString(sklad.findByName(searchName)));
    }
}
