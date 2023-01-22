package ru.sbrf.gitcommit.week5;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Гарри поттер \"Философский камень\"");
        Book book2 = new Book("Гарри поттер \"Тайная комната\"");
        Book book3 = new Book("Гарри поттер \"Узник Азкабана\"");
        Book book4 = new Book("Гарри поттер \"Кубок огня\"");
        Book book5 = new Book("Гарри поттер \"Орден Феникса\"");
        Book book6 = new Book("Гарри поттер \"Принц-полукровка\"");
        Book book7 = new Book("Гарри поттер \"Дары Смерти\"");

        Magazine magazinne = new Magazine("Ozon");
        book1.print();
        magazinne.print();

        /*
         * Создать массив типа Printable, который будет содержать книги и журналы.
         * В цикле пройти по массиву и вызвать метод print() для каждого объекта.
         */
        Printable[] books = {book1, book2, book3, book4, book5, book6, book7};
        for (Printable book : books) {
            book.print();
        }
    }
}
