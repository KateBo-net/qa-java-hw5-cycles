package ru.netology.services;

public class HolidayCalcService {
    public int calculate(int income, int expenses, int threshold) {
        int accountBalance = 0;
        int countOfVacationMonth = 0;

        for (int i = 1; i < 13; i++) {
            if (accountBalance >= threshold) {
                System.out.println("Месяц " + i + ". Денег " + accountBalance + ". Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + (accountBalance - expenses) * 2 / 3);
                accountBalance = (accountBalance - expenses) / 3;
                countOfVacationMonth++;
            } else {
                System.out.println("Месяц " + i + ". Денег " + accountBalance + ". Придётся работать. Заработал +" + income + ", потратил -" + expenses);
                accountBalance = accountBalance + income - expenses;
            }
        }
        System.out.println("Месяцев для отдыха: " + countOfVacationMonth);
        return countOfVacationMonth;
    }
}
