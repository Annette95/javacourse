package test;

import java.sql.SQLOutput;
import java.util.Objects;

public class Person {
    static final Integer wage =100;
    String name;
    String job;
    int age;
    String ageT = "5";

    public Person(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public Person() {

    }

    public Person(String name, String job, Integer age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(job, person.job) &&
                Objects.equals(ageT, person.ageT);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, job, age, ageT);
    }

    public static void main (String[] args){

        Person person = new Person(30,"Anna","QA");

        Person person2 = new Person(30,"Anna","QA");

        Person.wage.equals(100);

        if(person==person2){
            System.out.println("TRUE");
        }

        if(person.equals(person2)){
            System.out.println("true");
        }

        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());
    }

}