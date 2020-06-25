package task2.subtask5;

public class Run {
    public static void main (String[] args){

        Run.callAnimal(new Horse(),"black");
        Run.callAnimal(new Cow(),"white");
        Run.callAnimal(new Lion(),"beige");
    }


    private static void callAnimal(Animal animal, String col){
        animal.eat();
        animal.sleep();
        animal.sound();
        animal.color(col);
    }
}
