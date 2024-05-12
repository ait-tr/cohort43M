package hwlesson21.Incapsulation.task3;

public class Main {
    public static void main(String[] args) {
        SystemConfiguration sc1 = new SystemConfiguration(2, "/var/log/app.log", "Pass");
//        System.out.println(sc1.changeLogLevel(5));
        System.out.println(sc1.changelogFilePath("/var/log/app.log2"));
    }
}
