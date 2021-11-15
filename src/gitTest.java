public class gitTest {
    private String name;
    private String secondName;
    private int age;

    @Override
    public String toString() {
        return "gitTest{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    public gitTest(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;


    }
}
