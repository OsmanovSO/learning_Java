package ru.sbrf.gitcommit.week2;

public class RealtyAgreement extends Agreement {

    private String realtyObject;

    public RealtyAgreement() {
        super();
    }

    public static class RealtyBuilder extends Builder {

        private final RealtyAgreement newRealtyAgreement;

        public RealtyBuilder() {
            newRealtyAgreement = new RealtyAgreement();
        }

        public RealtyAgreement.RealtyBuilder newRealtyObject(String realtyObject) {
            newRealtyAgreement.realtyObject = realtyObject;
            return this;
        }

        @Override
        public RealtyAgreement build() {
            newRealtyAgreement.setReference(reference);
            newRealtyAgreement.money = money;
            newRealtyAgreement.beneficiary = beneficiary;
            return newRealtyAgreement;
        }
    }

    public void setRealtyObject(String realtyObject) {
        this.realtyObject = realtyObject;
    }

    @Override
    public String toString() {
        return "ru.sbrf.gitcommit.week2.RealtyAgreement{" +
                "realtyObject='" + realtyObject + '\'' +
                ", reference='" + getReference() + '\'' +
                ", money=" + money +
                ", beneficiary=" + beneficiary +
                '}';
    }
}
