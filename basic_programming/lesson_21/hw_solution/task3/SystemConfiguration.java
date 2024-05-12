package homework.encapsulation.task3;

public class SystemConfiguration {
    private int logLevel;
    private String logFilePath;

    public SystemConfiguration(int logLevel, String logFilePath) {
        setLogLevel(logLevel);
        setLogFilePath(logFilePath);
    }

    public int getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(int logLevel) {
        if (logLevel >= 1 && logLevel <= 5) {
            this.logLevel = logLevel;
        } else {
            System.err.println("Ошибка: Некорректный уровень логирования.");
            this.logLevel = 1;
        }
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(String logFilePath) {
        if (logFilePath != null && !logFilePath.isEmpty()) {
            this.logFilePath = logFilePath;
        } else {
            System.err.println("Ошибка: Некорректный путь к файлам логов.");
            this.logFilePath = "default_log_path.log";
        }
    }

}

