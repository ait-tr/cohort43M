package code;

import java.util.Arrays;

public class Library {
    private BookStorage[] library;

    public Library(BookStorage[] library) {
        this.library = library;
    }

    public BookStorage[] getLibrary() {
        return library;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + Arrays.toString(library) +
                '}';
    }


// --------- добавим методы для работы нашей библиотеки -------
/*
- searchDataLibrary
- printDataLibrary
 */


}
