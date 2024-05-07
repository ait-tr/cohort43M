package code;

public class CreateLibraryData {

    public Library createLibrary(int storageAmount, int shelvesAmount){


        Author author1 = new Author("Джек Лондон");
        Author author2 = new Author("Фейхтвангер");
        Author author3 = new Author("Голсуорси");
        Author author4 = new Author("Жуль Верн");
        Author author5 = new Author("Артур Конан Дойл");
        Author author6 = new Author("Гоголь");
        Author author7 = new Author("Марк Твен");
        Author author8 = new Author("Сервантес");
        Author author9 = new Author("Ремарк");
        Author author10 = new Author("Жорж Санд");
        Author author11 = new Author("Пушкин");

        Book book1 = new Book("A-001-001", "Белый клык", author1);
        Book book2 = new Book("A-002-002", "Зов предков", author1);
        Book book3 = new Book("A-003-003", "Гойя", author2);
        Book book4 = new Book("A-004-004", "Сага о Форсайтах", author3);
        Book book5 = new Book("A-005-005", "20 тысяч лье под водой", author4);
        Book book6 = new Book("A-006-006", "Таинственный остров", author4);
        Book book7 = new Book("A-007-007", "Вокруг света за 80 дней", author4);
        Book book8 = new Book("A-008-008", "Записки о Шерлоке Холмсе", author5);
        Book book9 = new Book("A-009-009", "ВИЙ", author6);
        Book book10 = new Book("A-010-009", "Мертвые души", author6);
        Book book11 = new Book("A-010-010", "Вечера на хуторе близ Диканьки", author6);
        Book book12 = new Book("A-010-011", "Приключения Тома Сойера", author7);
        Book book13 = new Book("A-011-011", "Дон Кихот", author8);
        Book book14 = new Book("A-012-012", "Три товарища", author9);
        Book book15 = new Book("A-013-013", "На западном фронте без перемен", author9);
        Book book16 = new Book("A-014-014", "Консуэло", author10);
        Book book17 = new Book("A-015-015", "Руслан и Людмила", author11);


        Book[] booksForShelf1 = new Book[]{book1, book2, book3, book4, book5};
        Book[] booksForShelf2 = new Book[]{book6, book7, book8, book9, book10};
        Book[] booksForShelf3 = new Book[]{book11, book12, book13, book14, book15};
        Book[] booksForShelf4 = new Book[]{book16, book17};


        BookShelf bookShelf1 = new BookShelf("B1",booksForShelf1);
        BookShelf bookShelf2 = new BookShelf("C1",booksForShelf2);
        BookShelf bookShelf3 = new BookShelf("F1",booksForShelf3);
        BookShelf bookShelf4 = new BookShelf("G1",booksForShelf4);


        BookStorage bookStorage1 = new BookStorage("Left side", 2);
        BookStorage bookStorage2 = new BookStorage("Right side", 2);


        bookStorage1.getBookShelves()[0] = bookShelf1;
        bookStorage1.getBookShelves()[1] = bookShelf2;
        bookStorage2.getBookShelves()[0] = bookShelf3;
        bookStorage2.getBookShelves()[1] = bookShelf4;


        Library library = new Library(new BookStorage[] {bookStorage1, bookStorage2});

        return library;



    }
}
