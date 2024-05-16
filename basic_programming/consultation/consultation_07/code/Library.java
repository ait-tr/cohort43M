package code;

import java.util.Arrays;

public class Library {
    private BookStorage[] storages;

    public Library(BookStorage[] storages) {
        this.storages = storages;
    }

    public BookStorage[] getStorages() {
        return storages;
    }

    @Override
    public String toString() {
        return "Library{" +
                "storages=" + Arrays.toString(storages) +
                '}';
    }

    // --------- добавим методы для работы нашей библиотеки -------
/*
- searchDataLibrary
- printDataLibrary
 */


//    public Book[] searchBooksByAuthor(String authorName){
//
//    }


    public void printDataLibrary(){


        // проходим по нашей библиотеке в которой объектом хранения данных является массив шкафов
        // то есть нам нужно пройтись в цикле по это массиву

        for (int i = 0; i < storages.length; i++) {

            // из массива шкафов возьмем текущий шкаф
            BookStorage currentBookStorage = storages[i];
            System.out.println(currentBookStorage.getLineId());

            // из ЭТОТГО шкафа возьмем ссылку на массив полок
            BookShelf[] shelvesFromCurrentStorage = currentBookStorage.getBookShelves();

            for (int j = 0; j < shelvesFromCurrentStorage.length; j++) {
                //берем из этого массива по одной полке (по очереди)
                BookShelf currentBookShelf = shelvesFromCurrentStorage[j];
                System.out.println(currentBookShelf.getIdNumber());

                // с этой полки берем ссылку на тот массив книг который на ней находится
                Book[] booksOnCurrentShelf = currentBookShelf.getBooks();

                for (int k = 0; k < booksOnCurrentShelf.length; k++) {
                    System.out.println("Книга: " + booksOnCurrentShelf[k]);
                }
            }

        }

    }


    public void searchDataLibraryByBookName(String bookName) {
        for (int i = 0; i < storages.length; i++) {

            // из массива шкафов возьмем текущий шкаф
            BookStorage currentBookStorage = storages[i];

            // из ЭТОТГО шкафа возьмем ссылку на массив полок
            BookShelf[] shelvesFromCurrentStorage = currentBookStorage.getBookShelves();

            for (int j = 0; j < shelvesFromCurrentStorage.length; j++) {
                //берем из этого массива по одной полке (по очереди)
                BookShelf currentBookShelf = shelvesFromCurrentStorage[j];

                // с этой полки берем ссылку на тот массив книг который на ней находится
                Book[] booksOnCurrentShelf = currentBookShelf.getBooks();

                for (int k = 0; k < booksOnCurrentShelf.length; k++) {

                    if (booksOnCurrentShelf[k].getBookName().equals(bookName)) {
                        System.out.println("книга найдена и находится:");
                        System.out.println("Шкаф: " + currentBookStorage.getLineId());
                        System.out.println("Полка: " + currentBookShelf.getIdNumber());
                        System.out.println("Книга: " + booksOnCurrentShelf[k]);
                        return;
                    }
                }
            }
        }
        System.out.println("Книги с названием " + bookName + " не найдено!");
    }


}
