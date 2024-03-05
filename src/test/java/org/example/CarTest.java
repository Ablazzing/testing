package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("Тестирование машины")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CarTest {
    private static Car car = new Car(10);

    @Test
    @DisplayName("Машина запустилась с 10 литрами")
    @Order(2)
    public void startSuccess() {
        double inputFuel = 10;
        Assertions.assertDoesNotThrow(() -> new Car(inputFuel));
        Assertions.assertDoesNotThrow(() -> car.start());
    }

    @Test
    @DisplayName("Ошибка запуска машины при отсутствии бензина")
    @Order(1)
    public void startThrow() {
        double inputFuel = -1;
        car.start();
        Assertions.assertThrows(Exception.class, () -> new Car(inputFuel));
    }
}
