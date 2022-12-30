package ru.sbrf.gitcommit.week2;

public class Main {
    public static void main(String[] args) {

        RealtyAgreement realtyAgreement = (RealtyAgreement) new RealtyAgreement.RealtyBuilder()
                .newRealtyObject("Подсобное помещение, 120 кв.м")
                .newReference("S0000001")
                .newAmount(new Money(100, "RUB"))
                .newBeneficiary(new Person("Османов Салман Османович", "03051992"))
                .build();

        realtyAgreement.setRealtyObject("Подсобное помещение, 300 кв.м");
        realtyAgreement.setReference("R00000002");
        realtyAgreement.money.setAmount(5000);
        realtyAgreement.money.setCurrency("USD");
        realtyAgreement.beneficiary.setName("Иванов Иван Иванович");
        realtyAgreement.beneficiary.setTaxId("1234567");

        System.out.println(realtyAgreement);

        java.lang.String string = "Изучаем Java";
        Class stringClass = string.getClass();
        System.out.println(stringClass.getName());
    }
}

