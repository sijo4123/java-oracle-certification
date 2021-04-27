package Java11.interfaces;

interface Vehicle {
    default void print() {
        System.out.println("I am a vehicle!");
    }

    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }
}

class Car implements Vehicle {
    public void print() {
        Vehicle.super.print();
    }
}

class Test {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.print();

        Vehicle.blowHorn();
    }
}