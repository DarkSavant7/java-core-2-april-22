
package ru.gb.java_core_2.l1_oop;

public class Dog implements Moving, Attacking {

    @Override
    public void move(int length) {
        System.out.println("Dog walking on paws");
    }

    @Override
    public void attack() {
        System.out.println("Dog bites");
    }
}
