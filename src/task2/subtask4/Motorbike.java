package task2.subtask4;

public class Motorbike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorbike started engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorbike accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Motorbike brakes on");
    }

    @Override
    public void numberOfWheels(int a) {
        System.out.println("MotorBike has " + a + " wheels");
    }

}
