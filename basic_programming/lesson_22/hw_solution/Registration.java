public class Registration {
    public static void main(String[] args) {
        //Максимальное количество пользователей
        RegistrationService registrationService = new RegistrationService(10);
        //Регистрация пользователя
        registrationService.register();
        registrationService.register();
        registrationService.register();
        registrationService.register();
        //Вывод зарегистрированных пользователей
        registrationService.displayUsers();
        //Изменение пароля пользователя
        registrationService.changePassword();
        //Закрытие Сканера
        registrationService.closeScanner();
    }
}
