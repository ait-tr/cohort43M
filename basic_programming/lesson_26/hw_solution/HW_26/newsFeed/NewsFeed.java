package newsFeed;

import java.util.LinkedList;
import java.util.List;

public class NewsFeed {
    public static void main(String[] args) {

        List<News> newsList = new LinkedList<>();

        newsList.add(0, new News(1, "Шок!", "Декабрь: Маргарита Ивановна ворует газеты из соседских почтовых ящиков! Соседи потрясены..."));
        newsList.add(0, new News(2, "Невероятно!", "Январь: каждую субботу на главной площади города будут дарить шоколад всем желающим"));
        newsList.add(0, new News(3, "Срочная новость!", "Февраль: дворник Самойлов уходит в отпуск. Кто будет наводить порядок в нашем районе?"));
        newsList.add(0, new News(4, "Вы не поверите!", "Март: местные алкоголики Петров и Иванов не пьют уже третью неделю!"));
        newsList.add(0, new News(5, "Катастрофа!", "Апрель: отопительный сезон заканчивается досрочно. Вы запаслись теплыми носками?"));
        newsList.add(0, new News(6, "Вы не поверите!", "Май: никто не хочет маятся. Все хотят воодушевляться!"));

        for (News news : newsList) {
            System.out.println(news);
            }
        }
    }

