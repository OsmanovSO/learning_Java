package ru.sbrf.gitcommit.week2;

public class Person {

    private String name;

    private String taxId;

    public Person(String name, String taxId) {
        this.name = name;
        this.taxId = taxId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    @Override
    public String toString() {
        return "ru.sbrf.gitcommit.week2.Person{" +
                "name='" + name + '\'' +
                ", taxId='" + taxId + '\'' +
                '}';
    }
}

