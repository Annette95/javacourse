package task2.subtask4;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car started engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Car brakes on");
    }

    @Override
    public void numberOfWheels(int a) {
        System.out.println("Car has " + a + " wheels");

    }
}
