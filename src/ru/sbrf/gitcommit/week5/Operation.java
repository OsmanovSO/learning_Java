package ru.sbrf.gitcommit.week5;

/**
 * Создать абстрактный класс Operation типизированный абстрактным классом Agreement либо его наследниками.
 */
abstract public class Operation<T extends Agreement> {
    public T agreement;

    public Operation() {
    }

    public Operation(T agreement) {
        this.agreement = agreement;
    }
}
