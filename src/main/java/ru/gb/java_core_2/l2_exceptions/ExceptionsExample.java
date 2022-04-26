package ru.gb.java_core_2.l2_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionsExample {

    public static void main(String[] args) throws Throwable {
//        simpleTryCatchExample();
//        tryFinallyExample();
//        tryWithResources();
//        generateException();
//        generateCheckedException();

        try {
            System.out.println("Catching error");
            throwError();
        } catch (Error e) {
            System.out.println("oooups, stack overflow");
            System.out.println(e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    private static void throwError() {
        throw new StackOverflowError("AAAAAAAAAAAAAAAAA");
    }

    private static void generateCheckedException() throws MyCheckedException {
        //...............
        throw new MyCheckedException();
    }

    private static void generateException() {
        //.................
        if (10 > 5) {
//            MySomethingWentWrongException ex = new MySomethingWentWrongException();
//            throw ex;
            throw new MySomethingWentWrongException("IJBIOHBIOHB");
        }
    }

    private static void tryWithResources() {
        try (Scanner scanner = new Scanner(new FileInputStream("some.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void tryFinallyExample() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream("some.txt"));

            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing");
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static void simpleTryCatchExample() {
        //        Thread.getAllStackTraces().forEach((k, v) -> System.out.printf("Thread %s \n", k.getName()));

        try {
            System.out.println("Before div");
            if (1 > 0) {
                throw new RuntimeException();
            }
            divideByZero();
            int[] arr = {1, 2};
            System.out.println(arr[1]);
            System.out.println("After div");
//        } catch (RuntimeException e) {
//            System.out.println("Div 0");
//        }
        } catch (ArithmeticException e) {
            System.out.println("Div 0");
//            System.exit(1);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e) {
            System.out.println("AIOOBE");
        } finally {
            System.out.println("Finally");
        }

        System.out.println("After try");
    }

    private static void divideByZero() {
        div2(10, 0);
    }

    private static int div2(int a, int b) {
        return div1(a, b);
    }

    private static int div1(int a, int b) {
        return div0(a, b);
    }

    private static int div0(int a, int b) {
//        if (b == 0) {
//            return 0;
//        }
        int result = a / b;

        System.out.println("Result = " + result);
        return result;
    }
}
