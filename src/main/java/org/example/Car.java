package org.example;

public class Car {
    private double fuel = 0;

    public Car(double fuel) {
        if (fuel <= 0) {
            throw new RuntimeException("Нет бензина!");
        }
        this.fuel = fuel;
    }

    public void start() {
        if (fuel <= 0) {
            throw new RuntimeException("Нет бензина!");
        }
        fuel -= 10;
    }
}
