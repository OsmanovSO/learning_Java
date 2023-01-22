package ru.sbrf.gitcommit.week5;

/*
 * Определить класс Book, реализующий интерфейс Printable.
 */
public class Book implements Printable {
    public String name;

    public Book(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Эта книга называется " + name);
    }
}
