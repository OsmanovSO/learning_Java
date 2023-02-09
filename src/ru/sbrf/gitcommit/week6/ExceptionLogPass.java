package ru.sbrf.gitcommit.week6;

public class ExceptionLogPass {

    public static boolean validateLogPass(String login, String password, String confirmPassword) {

        try {
            if (!login.matches("[a-zA-Z0-9_]+") | login.length() >= 20) {
                throw new WrongLoginException("Неверный логин");
            }
            if (!password.matches("[a-zA-Z0-9_]+") | password.length() >= 20) {
                throw new WrongPasswordException("Неверный пароль");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
