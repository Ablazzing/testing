package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование компьютера")
public class ComputerTest {

    @Test
    @DisplayName("Запуск компьютера без ошибок")
    public void run() {
        Computer computer = new Computer();
        Assertions.assertDoesNotThrow(() -> computer.run());
    }

    //TDD - TEST DRIVEN DEVELOPMENT
}
