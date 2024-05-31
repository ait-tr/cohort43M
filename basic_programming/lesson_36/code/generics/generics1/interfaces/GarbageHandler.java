package code.generics.generics1.interfaces;

public interface GarbageHandler <T,S>{
    void handle(T what, S how);

   <E> void transfer(E dangerousWaste);

}
