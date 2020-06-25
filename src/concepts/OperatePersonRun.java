package concepts;

import concepts.OperatePerson;

public class OperatePersonRun extends OperatePerson{

    public void printSome(){
        String local = "Hello";
        System.out.println(local);
    }

    public static void main (String[] args){
        OperatePerson person = new OperatePerson();
        OperatePersonRun operatePersonRun = new OperatePersonRun();
//        System.out.println(person.toString());
//        person.changeSecondName("Ciobanu");
//        person.changeName("Anew");
//        System.out.println(person.getAgeChange());
//        System.out.println(person.getNameChange());
//        System.out.println(person.toString());

        System.out.println(person.createNewPerson("Tom",11,"QA"));

    }
}
