package homework.encapsulation.task3;

public class App {
    public static void main(String[] args) {
        SystemConfiguration config = new SystemConfiguration(3, "logs/app.log");

        System.out.println("Текущий уровень логирования: " + config.getLogLevel());
        System.out.println("Текущий путь к файлам логов: " + config.getLogFilePath());


        config.setLogLevel(2);
        config.setLogFilePath("logs/new_app.log");


        System.out.println("Новый уровень логирования: " + config.getLogLevel());
        System.out.println("Новый путь к файлам логов: " + config.getLogFilePath());
    }

}
