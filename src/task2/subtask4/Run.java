package task2.subtask4;

public class Run {

    public static void main (String[] args){
        Run.callVehicle(new Motorbike(),2);
        Run.callVehicle(new Car(),4);
        Run.callVehicle(new Truck(),4);
    }


    private static void callVehicle(Vehicle vehicle, int a){
        vehicle.startEngine();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.numberOfWheels(a);
    }
}
