package code.anonimousClasses.oldSchool;

import code.anonimousClasses.MonitoringSystem;

public class ErrorMonitoringModule implements MonitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг контроля за ошибками в системе запущен");
    }
}
