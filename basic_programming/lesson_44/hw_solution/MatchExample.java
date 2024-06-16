package Homework_44.task_match;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class MatchExample {
    public static void main(String[] args) throws IOException {
        /*
        1) посчитать общее количество матчей
        2) выбрать ТОП-10 самых посещаемых
        3) посчитать сколько матчей содержит информацию о стадионе
        ------------------------------------

         */

        BufferedReader bufferedReader = new BufferedReader(new FileReader("basic_programming/lesson_44/code/resources/matches.txt"));
        String line;

        List<Match> matches = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null) {
            //System.out.println(line);
            matches.add(createRecord(line));
        }

        bufferedReader.close();

        System.out.println(matches);
    }

    private static Match createRecord(String line) {
        String[] data = line.split(",");

        String year = data[0].trim();
        String month = data[1].trim();
        String day = data[2].trim();
        String team1 = data[3].trim();
        String result = data[4].trim();
        String team2 = data[5].trim();

        int watchers = 0;

        if (!Objects.equals(data[6].trim(), "NULL")) {
            watchers = Integer.parseInt(data[6].trim());
        }

        String stadium = "";

        if (data[7] != null) {
            stadium = data[7].trim();
        }

        return new Match(year, month, day, team1, result, team2, watchers, stadium);


    }

    //a) Выбор всех матчей, которые были в первой половине месяца
    public List<Match> getMatchesInFirstHalfOfMonth(List<Match> matches) {
        return matches.stream()
                .filter(match -> Integer.parseInt(match.getDay()) <= 15)
                .collect(Collectors.toList());
    }

    //b) Подсчет общего количества матчей в выборке
    public long countMatches(List<Match> matches) {
        return matches.size();
    }

    // c) Выбор топ 10 самых посещаемых матчей
    public List<Match> getTop10MostAttendedMatches(List<Match> matches) {
        return matches.stream()
                .sorted(Comparator.comparingInt(Match::getWatchers).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }


    //e) Подсчет количества матчей, содержащих упоминания о стадионе
    public long countMatchesWithStadiumMentions(List<Match> matches, String stadiumName) {
        return matches.stream()
                .filter(match -> match.getStadium().contains(stadiumName))
                .count();
    }
    //f) Подсчет количества матчей, сыгранных каждой командой в качестве гостя

    public Map<String, Long> countMatchesPlayedByEachTeamAsGuest(List<Match> matches) {
        return matches.stream()
                .collect(Collectors.groupingBy(Match::getTeam2, Collectors.counting()));
    }

//g) Выделение наиболее популярного дня проведения матча
public String getMostPopularMatchDay(List<Match> matches) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    return matches.stream()
            .map(match -> LocalDate.of(Integer.parseInt(match.getYear()), Integer.parseInt(match.getMonth()), Integer.parseInt(match.getDay())).getDayOfWeek().name())
            .collect(Collectors.groupingBy(day -> day, Collectors.counting()))
            .entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(null);
}

}