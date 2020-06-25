package task2.subtask4;

public class Truck implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Truck started engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Truck brakes on");

    }

    @Override
    public void numberOfWheels(int a) {
        System.out.println("Truck has " + a + " wheels");
    }
}
