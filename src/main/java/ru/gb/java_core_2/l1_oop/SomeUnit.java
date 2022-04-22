package ru.gb.java_core_2.l1_oop;

public class SomeUnit implements SomeInterface, ExampleMultiInterface{
    @Override
    public void attack() {

    }

    @Override
    public void move(int length) {

    }

    @Override
    public boolean isSomething() {
        return false;
    }

    @Override
    public int calcSomething() {
        return 0;
    }

    @Override
    public void doSomething() {

    }

//    @Override
//    public void defaultMethod() {
////        ExampleMultiInterface.super.defaultMethod();
//        System.out.println("Override default");
//    }
}
