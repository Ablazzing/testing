package org.example;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTest {
    private static Calc calc = new Calc();

    @Nested
    @DisplayName("Операции сложения")
    public class AddTest {
        @Test
        public void addSuccess() {
            int inputParam1 = 2;
            int inputParam2 = 3;

            int result = calc.add(inputParam1, inputParam2);
            int expected = 5;

            assertEquals(expected, result);
        }

        @ParameterizedTest
        @CsvFileSource(resources = "/data_add.csv", delimiter = ';')
        public void addParametrized(Integer inputParam1, Integer inputParam2, Integer expected) {
            int result = calc.add(inputParam1, inputParam2);

            assertEquals(expected, result);
        }
    }

    @Nested
    @DisplayName("Операции деления")
    public class DivideTest {
        @Test
        public void divideThrow() {
            double inputParam1 = 10;
            double inputParam2 = 0;

            assertThrows(RuntimeException.class, () ->  calc.divide(inputParam1, inputParam2));
        }

        @Test
        @SneakyThrows
        public void divideSuccess() {
            double inputParam1 = 10;
            double inputParam2 = 2;

            double result = calc.divide(inputParam1, inputParam2);
            double expected = 5;

            assertEquals(expected, result);
        }
    }


}
