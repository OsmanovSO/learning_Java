package ru.sbrf.gitcommit.service;

import ru.sbrf.gitcommit.week4.Agreement;

public class AgreementService {
    public void close(Agreement agreement) {
        switch (agreement.getAgreementStatus()) {
            case DRAFT -> System.out.println("удаляем черновик");
            case ACTIVE -> System.out.println("закрываем аккредитив");
            case CLOSED -> System.out.println("аккредитив закрыт");
        }
    }
}
