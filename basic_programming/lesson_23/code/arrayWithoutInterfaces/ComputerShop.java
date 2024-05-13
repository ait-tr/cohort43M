package code.arrayWithoutInterfaces;

import code.library.var1.UserInput;

public class ComputerShop {
    public static void main(String[] args) {

        UserInput ui = new UserInput();
        Sklad sklad = new Sklad();

        SkladOperation skladOperation = new SkladOperation();

        skladOperation.operations(ui,sklad);
    }
}
