package task2.subtask2;

public class Gerbil extends Rodent{

    public Gerbil() {
        System.out.println("Gerbil class initialized");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil likes to eat corn");
    }

    @Override
    public void run() {
        System.out.println("Gerbil runs very fast if enemy is nearby");
    }

    @Override
    public void multiply() {
        System.out.println("One gerbil can give birth to 20 gerbils");
    }

}