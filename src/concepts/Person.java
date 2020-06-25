package concepts;

public class Person {
    private String name;
    private Integer age;
    private String job;
    private boolean satisfied;
    public String secondName;

    public Person(String name, Integer age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Person(String name, int age, String job, boolean satisfied, String secondName) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.satisfied = satisfied;
        this.secondName = secondName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isSatisfied() {
        return satisfied;
    }


    public void setSatisfied(boolean satisfied) {
        this.satisfied = satisfied;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", satisfied=" + satisfied +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
