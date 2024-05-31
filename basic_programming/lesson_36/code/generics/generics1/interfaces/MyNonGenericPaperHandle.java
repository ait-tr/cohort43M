package code.generics.generics1.interfaces;

import code.generics.generics1.classes.Paper;

public class MyNonGenericPaperHandle implements GarbageHandler<Paper, MyPaperHandleMethod> {
    @Override
    public void handle(Paper what, MyPaperHandleMethod how) {
        // здесь что-то делается с бумажным мусором
        //способом, который описан в MyPaperHandleMethod
    }

    @Override
    public <Glass> void transfer(Glass dangerousWaste) {

    }
}
