package task2.subtask2;

public class Mouse extends Rodent {

    public Mouse() {
        System.out.println("Mouse class initialized");
    }

    @Override
    public void eat() {
        System.out.println("Mouse likes to eat cheese");
    }

    @Override
    public void run() {
        System.out.println("Mouse runs very fast if cat is nearby");
    }

    @Override
    public void multiply() {
        System.out.println("One mouse can give birth to 10 mice");
    }
}
