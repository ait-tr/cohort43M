package code.library.repository;

import code.library.entity.LibraryElement;

public class LibraryRepository {

    LibraryElement[] elements;
    int count = 0;

    public LibraryRepository(int sizeOurLibrary) {
        this.elements = new LibraryElement[sizeOurLibrary];
    }

    public void add(LibraryElement element){
        if (count < elements.length) {
            elements[count] = element;
            count++;
        }
    }
}
