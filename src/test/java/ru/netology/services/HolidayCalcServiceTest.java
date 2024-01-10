package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HolidayCalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    public void shouldCalculateCountOfVacationMont(int expected, int income, int expenses, int threshold) {
        HolidayCalcService service = new HolidayCalcService();

        int actual = service.calculate(income, expenses, threshold);

        assertEquals(expected, actual);

    }
}
