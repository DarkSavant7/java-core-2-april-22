package ru.gb.java_core_2.l1_oop;

public interface ExampleMultiInterface {
    String INTERFACE_FIELD = "ngngng";

    boolean isSomething();

    int calcSomething();

    void doSomething();

    //Java 8+
    default void defaultMethod() {
        int num = privateCalc();
        System.out.println("Default");
        System.out.println("Num is " + num);
    }

    //Java 9+
    static void doStatic() {
        System.out.println("Static");
    }

    //Java 9+
    private int privateCalc() {
        return 9;
    }
}
