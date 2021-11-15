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

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public gitTest(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;


    }
}
