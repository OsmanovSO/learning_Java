package ru.sbrf.gitcommit.week2;

public class Money {

    private int amount;

    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "ru.sbrf.gitcommit.week2.Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}

