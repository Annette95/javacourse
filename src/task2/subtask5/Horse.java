package task2.subtask5;

public class Horse extends Animal {
    @Override
    public void eat() {
        System.out.println("Horse eats oats");
    }

    @Override
    public void sound() {
        System.out.println("Horse sounds like YAYAYAYAY");
    }

    @Override
    public void sleep() {
        System.out.println("Horse doesn't sleep much");
    }

    @Override
    public void color(String color) {
        super.color(color);
    }
}
