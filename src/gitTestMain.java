public class gitTestMain extends gitTest{
    public gitTestMain(String name, String secondName, int age) {
        super(name, secondName, age);
    }

    public static void main(String[] args) {

        gitTest user1 = new gitTest("Max", "Chernyaev", 29);
        gitTest user2 = new gitTest("Jack", "Black", 60);
        gitTest user3 = new gitTest("Sam", "Wilson", 45);

        System.out.println(user1);

    }
}
