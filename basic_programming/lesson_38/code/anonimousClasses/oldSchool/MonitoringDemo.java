package code.anonimousClasses.oldSchool;

public class MonitoringDemo {
    public static void main(String[] args) {
        GeneralMonitoringModule generalMonitoringModule = new GeneralMonitoringModule();
        ErrorMonitoringModule errorMonitoringModule = new ErrorMonitoringModule();
        SecurityMonitoringModule securityMonitoringModule = new SecurityMonitoringModule();

        generalMonitoringModule.startMonitoring();
        errorMonitoringModule.startMonitoring();
        securityMonitoringModule.startMonitoring();
    }
}
