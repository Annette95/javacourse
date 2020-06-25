package concepts;

public class OperatePerson {

    Person person = new Person("Andrei",25,"QA",true,"James");



    public void changeName(String name){
        person.setName(name);
    }

    public void changeSecondName(String secondName){
        person.setSecondName(secondName);
    }

    protected String getNameChange(){
        return person.getName();
    }

    Integer getAgeChange(Person person){
        return person.getAge();
    }

    public Person createNewPerson(String name,Integer age, String job){
    Person person = new Person(name,age,job);
    return person;
    }


    @Override
    public String toString() {
        return "OperatePerson{" +
                "person=" + person +
                '}';
    }
}

