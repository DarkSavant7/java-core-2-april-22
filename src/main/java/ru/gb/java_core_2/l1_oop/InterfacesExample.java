package ru.gb.java_core_2.l1_oop;

public class InterfacesExample {

    public static void main(String[] args) {
//        example();

    }

    private static void move(Moving moving, int length) {
        moving.move(length);
    }

    private static void example() {
        Car car = new Car();
        car.move(100);

        Moving ork = new Ork();
        ork.move(500);

        Moving[] units = {
                new Ork(),
                new Car(),
                new Ork(),
                new Plane(),
                new Dog(),
                new Dog(),
                new Dog(),
                new Car(),
                new Moving() {
                    @Override
                    public void move(int length) {
                        System.out.println("Anon moves");
                    }
                },
                l -> System.out.println("Lambda move"),
                length -> System.out.println("Anon moves")


        };

        for (Moving unit : units) {
            unit.move(500);

            if (unit instanceof Attacking) {
                ((Attacking) unit).attack();
            }
        }

        System.out.println(ExampleMultiInterface.INTERFACE_FIELD);

        SomeUnit unit = new SomeUnit();

        unit.defaultMethod();

        ExampleMultiInterface.doStatic();
    }
}