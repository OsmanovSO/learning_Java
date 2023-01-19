package ru.sbrf.gitcommit.week4;

public class Agreement {
    private AgreementStatus agreementStatus;

    public Agreement(AgreementStatus agreementStatus) {
        this.agreementStatus = agreementStatus;
    }

    public AgreementStatus getAgreementStatus() {
        return agreementStatus;
    }
}
