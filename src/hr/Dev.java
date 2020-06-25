package hr;

public class Dev extends Employee implements Print{

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Dev(String name, String secondName, String possition) {
        super(name, secondName, possition);
    }

    public Dev(String name, String secondName, String possition,String language) {
        super(name, secondName, possition);
        this.language=language;
    }

    @Override
    public void print() {
        System.out.println("hello from dev class");
    }
}
