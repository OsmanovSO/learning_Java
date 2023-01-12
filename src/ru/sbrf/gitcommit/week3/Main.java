package ru.sbrf.gitcommit.week3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Перегрузка метода
        System.out.println(PrintUtils.print(1));
        System.out.println(PrintUtils.print("Hello"));

        // Работа со строкой
        PrintUtils.stringWorld("I like Java!");

        // Классы обертки
        Wrapper wrapper = new Wrapper();
        System.out.println(wrapper.numberInt);
        System.out.println(wrapper.numberInteger);

        // Дата и время
        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата - " + today);
        System.out.println("Дата четыре недели назад - " + today.minusWeeks(4));
        System.out.println("Текущий месяц - " + today.getMonth());
    }
}
