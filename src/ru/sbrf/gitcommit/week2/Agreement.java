package ru.sbrf.gitcommit.week2;

public class Agreement {

    private String reference;

    protected Money money;

    protected Person beneficiary;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public static class Builder {

        protected String reference;

        protected Money money;

        protected Person beneficiary;
        private final Agreement newAgreement;

        public Builder() {
            newAgreement = new Agreement();
        }

        public Agreement.Builder newReference(String reference) {
            this.reference = reference;
            newAgreement.reference = reference;
            return this;
        }

        public Agreement.Builder newAmount(Money money) {
            this.money = money;
            newAgreement.money = money;
            return this;
        }

        public Agreement.Builder newBeneficiary(Person beneficiary) {
            this.beneficiary = beneficiary;
            newAgreement.beneficiary = beneficiary;
            return this;
        }

        public Agreement build() {
            return newAgreement;
        }

    }

    @Override
    public String toString() {
        return "Agreement{" +
                "reference='" + reference + '\'' +
                ", money=" + money +
                ", beneficiary=" + beneficiary +
                '}';
    }
}
