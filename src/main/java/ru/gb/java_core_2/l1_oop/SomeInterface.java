package ru.gb.java_core_2.l1_oop;

public interface SomeInterface extends Moving, Attacking {

    public static interface Nested {
        public interface Inner {
            public class InnerClass{

            }
        }
    }
}
