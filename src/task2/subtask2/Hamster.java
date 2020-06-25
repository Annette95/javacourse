package task2.subtask2;

public class Hamster extends Rodent {

    public Hamster() {
        System.out.println("Hamster class initialized");
    }

    @Override
    public void eat() {
        System.out.println("Hamster likes to eat all food");
    }

    @Override
    public void run() {
        System.out.println("Hamster runs very fast if human is nearby");
    }

    @Override
    public void multiply() {
        System.out.println("One hamster can give birth to 7 hamsters");
    }
}
