package ru.sbrf.gitcommit.week4;

import java.util.Scanner;

public class Age {
    public static void getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        switch (age) {
            case 0 -> System.out.println("Ты родился");
            case 6 -> System.out.println("Ты пошел в школу");
            case 17 -> System.out.println("Ты закончил школу");
            default -> System.out.println("Скорее всего тебя нет (");
        }
    }
}
