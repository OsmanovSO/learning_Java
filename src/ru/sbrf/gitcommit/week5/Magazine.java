package ru.sbrf.gitcommit.week5;

/*
 * Определить класс Magazine, реализующий интерфейс Printable.
 */
public class Magazine implements Printable {
    public String name;

    public Magazine(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Этот магазин называется " + name);
    }
}
