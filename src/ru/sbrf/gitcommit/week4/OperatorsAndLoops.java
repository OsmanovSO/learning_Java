package ru.sbrf.gitcommit.week4;

public class OperatorsAndLoops {
    static int number;
    static int count;

    public static void whileEven() {
        number = 0;
        count = 0;
        while (number <= 10) {
            count++;
            System.out.println(count % 3 == 0 ? number + "!" : number);
            number++;
        }

    }

    public static void whileOdd() {
        number = 10;
        count = 0;
        while (number >= 0) {
            count++;
            if (count % 3 == 0) {
                System.out.println(number + "!");
            } else {
                System.out.println(number);
            }
            number--;
        }
    }

    public static void forEven() {
        count = 0;
        for (int i = 0; i <= 10; i++) {
            count++;
            System.out.println(count % 3 == 0 ? i + "!" : i);
        }
    }

    public static void forOdd() {
        count = 0;
        for (int i = 10; i >= 0; i--) {
            count++;
            if (count % 3 == 0) {
                System.out.println(i + "!");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void doWhileEven() {
        number = 0;
        count = 0;
        do {
            count++;
            System.out.println(count % 3 == 0 ? number + "!" : number);
            number++;
        } while (number <= 10);
    }

    public static void doWhileOdd() {
        number = 10;
        count = 0;
        do {
            count++;
            if (count % 3 == 0) {
                System.out.println(number + "!");
            } else {
                System.out.println(number);
            }
            number--;
        } while (number >= 0);
    }
}
