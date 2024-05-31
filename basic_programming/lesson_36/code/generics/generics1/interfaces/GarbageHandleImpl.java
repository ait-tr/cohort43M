package code.generics.generics1.interfaces;

public class GarbageHandleImpl<T,S> implements GarbageHandler<T,S>{
    @Override
    public void handle(T what, S how) {
        // тут что-то будет делаться с мусором типа Т способом S
    }

    @Override
    public <E> void transfer(E dangerousWaste) {

    }


}
