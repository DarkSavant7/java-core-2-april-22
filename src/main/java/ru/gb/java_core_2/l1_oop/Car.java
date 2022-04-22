package ru.gb.java_core_2.l1_oop;

public class Car implements Moving {

    @Override
    public void move(int length) {
        System.out.println("Car ride");
    }
}
