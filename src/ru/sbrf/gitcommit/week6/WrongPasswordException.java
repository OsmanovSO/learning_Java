package ru.sbrf.gitcommit.week6;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String description) {
        super(description);
    }
}