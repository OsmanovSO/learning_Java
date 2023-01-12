package ru.sbrf.gitcommit.week3;

public class PrintUtils {

    public static int print(int number) {
        return number;
    }

    public static String print(String string) {
        return string;
    }

    public static void stringWorld(String string) {
        // Распечатать последний символ строки. Используем метод String.charAt() и length()
        System.out.println(string.charAt(string.length() - 1));
        // Проверить, заканчивается ли строка подстрокой “!”. Используем метод String.endsWith().
        System.out.println(string.endsWith("!"));
        // Проверить, начинается ли строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println(string.startsWith("I like"));
        // Проверить, содержит ли строка подстроку “Java”. Используем метод String.contains().
        System.out.println(string.contains("Java"));
        // Найти позицию подстроки “Java” в строке “I like Java!”.
        System.out.println(string.indexOf("Java"));
        // Преобразуйте строку к верхнему регистру.
        System.out.println(string.toUpperCase());
        // Преобразуйте строку к нижнему регистру.
        System.out.println(string.toLowerCase());
        // Вырезать строку Java c помощью метода String.substring().
        System.out.println(string.substring(3, 11));
        // Развернуть строку.
        System.out.println(new StringBuilder(string).reverse());
    }
}
