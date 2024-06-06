package code.lambdaExample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class Handler implements Function<Request, String> {

    private final Map<Predicate<Integer>, String> responses;

    public Handler() {
        this.responses = new LinkedHashMap<>();
        responses.put(code -> code >= 100 && code < 200, "Запрос получен");
        responses.put(code -> code >= 200 && code < 300, "Ок");
        responses.put(code -> code >= 300 && code < 400, "Сервисный запрос");
        responses.put(code -> code >= 400 && code < 500, "Ошибка пользователя");
        responses.put(code -> code >= 500 && code <= 550, "Ошибка сервера");

    }

    @Override
    public String apply(Request request) {
        // проверка данных из запроса
        // - проверка значения кода
        if (request.getMessage().length() > 10){
            return "Некорректные входящие данные: длина сообщения превышает установленный размер";
        }

        for (Map.Entry<Predicate<Integer>, String> entry : responses.entrySet()){
            if (entry.getKey().test(request.getCode())) {
                return entry.getValue();
            }
        }

        return "Значение в запросе не входит в установленный диапазон";
    }
}
