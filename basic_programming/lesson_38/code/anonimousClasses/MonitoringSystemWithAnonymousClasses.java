package code.anonimousClasses;

public class MonitoringSystemWithAnonymousClasses {
    public static void main(String[] args) {

        MonitoringSystem generalMonitoring = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг основных показателей запущен");
            }
        };

        MonitoringSystem errorMonitoring = new MonitoringSystem() {

            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг контроля за ошибками в системе запущен");
            }

        };
        MonitoringSystem securityMonitoring = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг контроля безопасности запущен");
            }
        };

        generalMonitoring.startMonitoring();
        errorMonitoring.startMonitoring();
        securityMonitoring.startMonitoring();




    }
}
