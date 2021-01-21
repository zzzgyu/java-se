package com.allweing.day17;

import java.util.function.Supplier;

/**
 * @auther: zzzgyu
 */

class Car {
    //Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
}


public class Test{
    public static void main(String[] args) {
        Car car = Car.create(Car::new);
        System.out.println(car);
        Car car1 = new Car();
        System.out.println(car1);
    }
}