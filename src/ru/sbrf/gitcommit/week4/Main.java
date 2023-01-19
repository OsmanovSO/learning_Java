package ru.sbrf.gitcommit.week4;

import ru.sbrf.gitcommit.service.AgreementService;

public class Main {
    public static void main(String[] args) {
        // Оператор while, for, do-while, условный и тернарный
        System.out.println("Cycle While even");
        OperatorsAndLoops.whileEven();

        System.out.println("Cycle While odd");
        OperatorsAndLoops.whileOdd();

        System.out.println("Cycle For even");
        OperatorsAndLoops.forEven();

        System.out.println("Cycle For odd");
        OperatorsAndLoops.forOdd();

        System.out.println("Cycle Do while even");
        OperatorsAndLoops.doWhileEven();

        System.out.println("Cycle Do while odd");
        OperatorsAndLoops.doWhileOdd();

        // Оператор switch
        Age.getAge();

        // Задание с enum
        Agreement agreement = new Agreement(AgreementStatus.CLOSED);
        AgreementService agreementService = new AgreementService();
        agreementService.close(agreement);

        // Задание с arrays
        int[] numbers = {5, 6, 7, 8, 9, 10};
        for (int i : numbers) {
            System.out.println(numbers[i]);
        }

        // Задание со звездочкой. Игра в морской бой
        WarShips.warShipsStart();
    }
}
