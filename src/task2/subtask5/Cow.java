package task2.subtask5;

public class Cow extends Animal {
    @Override
    public void eat() {
        System.out.println("Cow eats grass");
    }

    @Override
    public void sound() {
        System.out.println("Cow sounds like MUUUUUUU");
    }

    @Override
    public void sleep() {
        System.out.println("Cow sleeps 4 hours");
    }
}
