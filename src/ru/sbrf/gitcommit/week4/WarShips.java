package ru.sbrf.gitcommit.week4;

import java.util.Scanner;

/*
 * Создать класс WarShips. В нем создать массив char 10х10,
 * где пустое поле - ' ', палуба - 'O', подбитая палуба - 'X'.
 * Сделать статический метод, проверяющий что в массиве есть хотябы один символ 'O'.
 * Сделать цикл, работающий пока есть хотябы один символ 'O' в массиве.
 * В цикле считываем из консоли x и y, при попадании меняем символ и выводим поле в консоль
 */
public class WarShips {
    public static final char E = '-';
    public static final char O = 'O';
    public static final char X = 'X';
    static char[][] field = {
            {E, E, E, E, E, E, E, E, E, E},
            {E, O, E, E, O, E, E, O, O, O},
            {E, O, E, E, E, E, E, E, E, E},
            {E, E, E, O, O, O, E, E, O, E},
            {E, E, E, E, E, E, E, E, O, E},
            {E, E, E, E, E, O, E, E, E, E},
            {E, E, O, O, E, O, E, E, E, E},
            {E, E, E, E, E, O, E, O, E, E},
            {E, O, E, E, E, O, E, E, E, E},
            {E, E, E, E, E, E, E, E, O, E}
    };

    public static boolean findChar() {

        for (char[] i : field) {
            for (char j : i) {
                if (j == O) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printField() {
        for (char[] i : field) {
            for (char j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void warShipsStart() {
        while (WarShips.findChar()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значение X:");
            int x = scanner.nextInt();
            System.out.println("Введите значение Y:");
            int y = scanner.nextInt();
            if (WarShips.field[x][y] == O) {
                WarShips.field[x][y] = X;
                System.out.println("Попааал");
                WarShips.printField();
            } else {
                System.out.println("Не попал");
            }

        }
    }
}
