package hwlesson21.Incapsulation.task3;

import java.util.Scanner;

public class SystemConfiguration {
    private int logLevel;
    private String logFilePath;
    private String logLevelPassword;

    public SystemConfiguration(int logLevel, String logFilePath, String logLevelPassword) {
        this.logLevel = logLevel;
        this.logFilePath = logFilePath;
        this.logLevelPassword = logLevelPassword;
    }

    public int getLogLevel() {
        return logLevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public String getLogLevelPassword() {
        return logLevelPassword;
    }

    private void setLogLevel(int logLevel) {
        this.logLevel = logLevel;
    }

    private void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public String changeLogLevel(int newLogLevel){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter current Log level password: ");
        String currentPassword = scanner1.nextLine();
        scanner1.close();
        if ( currentPassword.equals(getLogLevelPassword())){
            setLogLevel(newLogLevel);
            return "Log level was changed";
        }
        else {
            return "Wrong current Log level password";
        }
    }
    public String changelogFilePath(String newlogFilePath){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter current Log level password: ");
        String currentPassword = scanner2.nextLine();
        scanner2.close();
        if (currentPassword.equals(getLogLevelPassword())){
            setLogFilePath(newlogFilePath);
            return "Log file path was changed";
        }
        else {
            return "Wrong current Log level password";
        }
    }
}
