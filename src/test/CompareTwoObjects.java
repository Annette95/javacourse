package test;

import java.util.Objects;

public class CompareTwoObjects {

    String name;

    public boolean equals(CompareTwoObjects cat) {
        return this.name == cat.name;
    }

    public int hashCodeOverriden() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {

        CompareTwoObjects cat1 = new CompareTwoObjects();
        cat1.name = "Princess";

        CompareTwoObjects cat2 = new CompareTwoObjects();
        cat2.name = "Princess";


        System.out.println("---------------------------objects equal by values but have different hash codes------------------");
        //objects equal by values but have different hash codes
        System.out.println("cat1 hashcode: " + cat1.hashCode());
        System.out.println("cat2 hashcode: " + cat2.hashCode());
        System.out.println(cat1.equals(cat2));


        System.out.println("---------------------------objects equal by values but have same hash codes------------------");
        //objects equal by values but have same hash codes
        System.out.println("cat1 hashcode: " + cat1.hashCodeOverriden());
        System.out.println("cat2 hashcode: " + cat2.hashCodeOverriden());
        System.out.println(cat1.equals(cat2));


        System.out.println("---------------------------objects not equal by values but have same hash codes------------------");
        //objects not equal by values but have same hash codes
        System.out.println("cat1 hashcode: " + cat1.hashCodeOverriden());
        System.out.println("cat2 hashcode: " + cat2.hashCodeOverriden());
        System.out.println(cat1 == cat2);


        System.out.println("---------------------------objects not equal by values but have different hash codes------------------");
        //objects not equal by values but have different hash codes
        System.out.println("cat1 hashcode: " + cat1.hashCode());
        System.out.println("cat2 hashcode: " + cat2.hashCode());
        System.out.println(cat1 == cat2);

    }
}
