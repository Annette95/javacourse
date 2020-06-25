package concepts;

public class ExtendedClass extends OperatePerson {

    public void printClass(){
        System.out.println("hey I'm extended class");
    }
    public static void main (String[] args){
        Person person = new Person("tom",20,"no job");
        ExtendedClass extendedClass = new ExtendedClass();
        System.out.println(extendedClass.toString());
        extendedClass.printClass();
        extendedClass.changeName("Anna");
        System.out.println(extendedClass.toString());

    }

}
