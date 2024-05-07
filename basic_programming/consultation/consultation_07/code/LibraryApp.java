package code;

public class LibraryApp {
    public static void main(String[] args) {
        CreateLibraryData data = new CreateLibraryData();

        Library library = data.createLibrary();

        library.printDataLibrary();

    }
}
