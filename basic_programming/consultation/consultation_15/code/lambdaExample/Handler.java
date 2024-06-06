package code.lambdaExample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class Handler implements Function<Request, String> {

    private final Map<Predicate<Integer>, String> responses;

    public Handler() {
        this.responses = new LinkedHashMap<>();

        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer code) {
                return code >= 100 && code < 200;
            }
        };

        Predicate<Integer> predicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer code) {
                return code >= 200 && code < 300;
            }
        };

        Predicate<Integer> predicate3 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer code) {
                return code >= 300 && code < 400;
            }
        };

        responses.put(predicate1, "Запрос получен");
        responses.put(predicate2, "Ок");
        responses.put(predicate3, "Сервисный запрос");
        responses.put(code -> code >= 400 && code < 500, "Ошибка пользователя");
        responses.put(code -> code >= 500 && code <= 550, "Ошибка сервера");

        System.out.println(responses);

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
