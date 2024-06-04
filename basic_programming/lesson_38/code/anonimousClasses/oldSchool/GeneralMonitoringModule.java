package code.anonimousClasses.oldSchool;

import code.anonimousClasses.MonitoringSystem;

public class GeneralMonitoringModule implements MonitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг основных показателей запущен");
    }
}
