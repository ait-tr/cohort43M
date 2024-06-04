package code;

public class NoteBookConstructorDemo {
    public static void main(String[] args) {
        NoteBookInnerClassConstructor myNoteBook = new NoteBookInnerClassConstructor("MacBook Pro", "Apple", 13, 1);

        System.out.println(myNoteBook);

        // Вызов методов внутреннего класса Monitor
        myNoteBook.getMonitor().brightnessUp();
        myNoteBook.getMonitor().brightnessDown();

        // Вызов методов внутреннего класса HDD
        myNoteBook.getHDD().readData();
        myNoteBook.getHDD().writeData();

        NoteBookInnerClassConstructor.Monitor myMonitor = myNoteBook.monitor;

        myMonitor.brightnessDown();

        }
}
