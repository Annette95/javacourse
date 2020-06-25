package hr;

public class QA extends Employee implements Print{

    public QA(String name, String secondName, String possition) {
        super(name, secondName, possition);
    }

    public static void main(String[] args) {

    }

    @Override
    public void print() {
        System.out.println("Hello from qa class");
    }
}
