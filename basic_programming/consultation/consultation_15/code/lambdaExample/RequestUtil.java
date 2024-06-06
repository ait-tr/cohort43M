package code.lambdaExample;

public class RequestUtil {

    public String checkRequest(Request request) {
      /*
      1) проверить корректность данных (длина сообщения меньше чем 10 символов)
2) используя значение из запроса если оно:
а) от 100 до 200 - вернуть сообщение ("Запрос получен")
b) от 200 до 300 - вернуть сообщение ("Ок")
c) от 300 до 400 - вернуть сообщение ("Сервисный запрос")
d) от 400 до 500 - вернуть сообщение ("Ошибка пользователя")
e) от 500 до 550 - вернуть сообщение ("Ошибка сервера")

3) вывести сообщение пользователю

       */

        String response = "";

        if (request.getMessage().length() > 10) {
            response = "Входные данные некорректны";
        } else {
            //response = checkCode(request.getCode());
            response = returnMessage(checkCodeVar2(request.getCode()));
        }

        return response;

    }

    private String checkCode(int code) {
        if (code >= 100 && code < 200) {
            return "Запрос получен";
        } else if (code >= 200 && code < 300) {
            return "Ок";
        } else if (code >= 300 && code < 400) {
            return "Сервисный запрос";
        } else if (code >= 400 && code < 500) {
            return "Ошибка пользователя";
        } else if (code >= 500 && code <= 550) {
            return "Ошибка сервера";
        }

        return "Значение в запросе не входит в установленный диапазон";
    }

    private int checkCodeVar2(int code) {
        if (code >= 100 && code < 200) {
            return 1;
        } else if (code >= 200 && code < 300) {
            return 2;
        } else if (code >= 300 && code < 400) {
            return 3;
        } else if (code >= 400 && code < 500) {
            return 4;
        } else if (code >= 500 && code <= 550) {
            return 5;
        }

        return 6;
    }

    private String returnMessage(int checkCodeResult) {
        switch (checkCodeResult) {
            case 1:
                return "Запрос получен";
            case 2:
                return "Ок";
            case 3:
                return "Сервисный запрос";
            case 4:
                return "Ошибка пользователя";
            case 5:
                return "Ошибка сервера";
            default:
                return "Не входит в диапазон";
        }
    }


}
