package ru.gb.java_core_2.l2_exceptions;

public class MySomethingWentWrongException extends RuntimeException {
    public MySomethingWentWrongException() {
    }

    public MySomethingWentWrongException(String message) {
        super(message);
    }
}
