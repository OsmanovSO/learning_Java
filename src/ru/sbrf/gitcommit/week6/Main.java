package ru.sbrf.gitcommit.week6;

public class Main {
    public static void main(String[] args) {
        Person sergey = new Person("Сергей", "sergey@mail.ru");
        String email = sergey
                .getEmail()
                .orElse("у Сергея нет почты");
        System.out.println(email);

        boolean isValidateLogPass = ValidateLogPass.validateLogPass("Osmanov_SO", "1qwertyuiop_", "1qwertyuiop_");
        System.out.println(isValidateLogPass);
    }
}
