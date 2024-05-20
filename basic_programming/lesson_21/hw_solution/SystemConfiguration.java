package Task3;

public class SystemConfiguration {
    private int logLevel;
    private String logPath;

    public SystemConfiguration(int logLevel, String logPath) {
        this.logLevel = logLevel;
        this.logPath = logPath;
    }
    public void setLogLevel(int logLevel) {
        if ( logLevel<0 || logLevel>5) {
            System.out.println("Некорректный уровень. Установите в пределах 1 - 5.");
        } else
        {this.logLevel = logLevel;
            System.out.println("Новый уровень логирования установлен");
        }
    }

    public int getLogLevel() {
        return logLevel;
    }

    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
        System.out.println("Новый путь установлен ");
    }

    public static void main(String[] args) {

        SystemConfiguration configuration = new SystemConfiguration(4, "c:/log/my.log/");

        System.out.println("Текущий уровень логирования : " + configuration.getLogLevel());
        System.out.println("Путь : " + configuration.getLogPath());

        configuration.setLogLevel(3);

        System.out.println("Текущий уровень логирования : " + configuration.getLogLevel());

        configuration.setLogPath("c:/system/log/mynew.log");

        System.out.println("Путь : " + configuration.getLogPath());

    }
}


