package hr;

public class Employee {
    private String name;
    private String secondName;
    private String possition;

    public Employee(String name, String secondName, String possition) {
        this.name = name;
        this.secondName = secondName;
        this.possition = possition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPossition() {
        return possition;
    }

    public void setPossition(String possition) {
        this.possition = possition;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", possition='" + possition + '\'' +
                '}';
    }
}
