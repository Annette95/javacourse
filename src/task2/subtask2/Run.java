package task2.subtask2;

public class Run {

    public static void main(String[] args) {

        Rodent rodent[] = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();

        for (int i = 0; i < rodent.length; i++) {
            rodent[i].eat();
            rodent[i].run();
            rodent[i].multiply();
        }
    }
}
