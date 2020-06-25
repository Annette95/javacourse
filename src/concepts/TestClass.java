package concepts;

public class TestClass {

    public String string1 = "I'm public string";
    private String string2 = "I'm private string";
    private Integer salary = 100;

    protected Integer integerValue = 100;

    String def = "I'm simple string";


    public static void main (String[] args) {
        TestClass testClass = new TestClass();
        testClass.salary = 200;


    }
}
