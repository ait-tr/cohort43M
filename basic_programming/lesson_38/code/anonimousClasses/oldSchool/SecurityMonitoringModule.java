package code.anonimousClasses.oldSchool;

import code.anonimousClasses.MonitoringSystem;

public class SecurityMonitoringModule implements MonitoringSystem {
    @Override
    public void startMonitoring() {

        System.out.println("Мониторинг контроля безопасности запущен");
    }
}
