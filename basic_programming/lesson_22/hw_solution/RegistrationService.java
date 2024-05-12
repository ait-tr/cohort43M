import java.util.Scanner;

public class RegistrationService {
    private User[] users;
    private int userCount;
    private Scanner scanner;

    public RegistrationService(int maxUsers) {
        this.users = new User[maxUsers];
        this.scanner = new Scanner(System.in);
        this.userCount = 0;
    }

    public void register() {
        System.out.println("Enter a login:");
        String login = scanner.nextLine();

        System.out.println("Enter a password:");
        String email = scanner.nextLine();

        System.out.println("Enter a password:");
        String password = scanner.nextLine();

        if (login.isEmpty() || password.isEmpty() || password.isEmpty()) {
            System.out.println("Ошибка регистрации. Заполните все поля");
            return;
        }
        if (userExists(login)) {
            System.out.println("Ошибка регистрации. Пользователь с таким именем уже существует.");
            return;
        }

        if (userCount == users.length) {
            System.out.println("Ошибка регистрации. Превышено максимальное количество пользователей.");
            return;
        }
        User newUser = new User(login, password, email);
        users[userCount] = newUser;
        userCount++;

        System.out.println("Пользователь успешно зарегистрирован.");
    }

    public boolean userExists(String username) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getLogin().equals(username)) {
                return true;
            }
        }
        return false;
    }
    public void displayUsers() {
        System.out.println("Зарегистрированные пользователи:");
        for (int i = 0; i < userCount; i++) {
            User user = users[i];
            System.out.println("Имя пользователя: " + user.getLogin());
            System.out.println("Пароль: " + user.getPassword());
            System.out.println("Email: " + user.getEmail());
            System.out.println();
        }
    }

    public void changePassword() {
        System.out.println("Введите имя пользователя:");
        String username = scanner.nextLine();

        System.out.println("Введите текущий пароль:");
        String oldPassword = scanner.nextLine();

        System.out.println("Введите новый пароль:");
        String newPassword = scanner.nextLine();

        User user = findUserByUsername(username);
        if (user == null) {
            System.out.println("Пользователь с указанным именем не найден.");
            return;
        }

        if (!user.getPassword().equals(oldPassword)) {
            System.out.println("Неверный текущий пароль.");
            return;
        }

        user.setPassword(newPassword);
        System.out.println("Пароль пользователя успешно изменен.");
    }

        private User findUserByUsername(String username) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getLogin().equals(username)) {
                return users[i];
            }
        }
        return null;
    }
    public void closeScanner() {
        scanner.close();
    }

}
