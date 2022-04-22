
package ru.gb.java_core_2.l1_oop;

public class Ork implements Moving, Attacking {

    @Override
    public void move(int length) {
        System.out.println("Ork walking on paws");
    }

    @Override
    public void attack() {
        System.out.println("Ork beats with axe");
    }
}
