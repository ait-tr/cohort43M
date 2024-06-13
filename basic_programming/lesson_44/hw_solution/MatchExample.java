package HomeWork;

import HomeWork.Match;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class MatchExample {
    public static void main(String[] args) throws IOException {
        /*
        1) посчитать общее количество матчей
        2) выбрать ТОП-10 самых посещаемых
        3) посчитать сколько матчей содержит информацию о стадионе
        4) выбрать все матчи которые были в первой половине месяца
        5) выбрать топ 3 матчей с самой большой разницей в счете на стадионе WWK Arena
        6) посчитать сколько матчей сыграла каждая команда в качестве гостя (в формате map)
        7) выделить наиболее популярный день проведения матча
        ------------------------------------

         */

        BufferedReader bufferedReader = new BufferedReader(new FileReader("lesson_44/code/resources/matches.txt"));
        String line;

        List<Match> matches = new ArrayList<>();


        while ((line = bufferedReader.readLine()) != null) {
            //System.out.println(line);
            matches.add(createRecord(line));
        }

        bufferedReader.close();

        //Все матчи:
        matches.forEach(System.out::println);

        //1)Общее количество матчей:
        System.out.println("Общее количество матчей: " + quantityMatch(matches));

        //2) выбрать ТОП-10 самых посещаемых
        List<Match> top10MostVisited = getTop10VisitedMatches(matches);
        System.out.println("ТОП-10 самых посещаемых матчей:");
        top10MostVisited.forEach(System.out::println);

        // 3) Посчитать сколько матчей содержит информацию о стадионе
        long matchesWithStadiumInfo = countMatchesWithStadiumInfo(matches);
        System.out.println("Количество матчей с информацией о стадионе: " + matchesWithStadiumInfo);

        //4) выбрать все матчи которые были в первой половине месяца
        List<Match> firstHalfMatches = getMatchesInFirstHalfOfMonth(matches);
        System.out.println("Матчи в первой половине месяца:");
        firstHalfMatches.forEach(System.out::println);

        //5) выбрать топ 3 матчей с самой большой разницей в счете на стадионе WWK Arena
        List<Match> top3MatchesWithLargestScoreDifference = getTop3MatchesWithLargestScoreDifference(matches, "WWK Arena");
        System.out.println("ТОП-3 матча с самой большой разницей в счете на стадионе WWK Arena:");
        top3MatchesWithLargestScoreDifference.forEach(System.out::println);

        //6) Посчитать сколько матчей сыграла каждая команда в качестве гостя (в формате map)
        Map<String, Long> matchesByGuestTeams = countMatchesByGuestTeams(matches);
        System.out.println("Количество матчей, сыгранных каждой командой в качестве гостя:");
        matchesByGuestTeams.forEach((team, count) -> System.out.println(team + ": " + count));

        //7) выделить наиболее популярный день проведения матча
        String mostPopularMatchDay = getMostPopularMatchDay(matches);
        System.out.println("Наиболее популярный день проведения матча: " + mostPopularMatchDay);
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

    public static int quantityMatch(List<Match> list) {
        int quantityMatch = list.size();
        return quantityMatch;
    }

    public static List<Match> getTop10VisitedMatches(List<Match> matches) {
        return matches.stream()
                .sorted(Comparator.comparingInt(Match::getWatchers).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }

    public static long countMatchesWithStadiumInfo(List<Match> matches) {
        return matches.stream()
                .filter(match -> !match.getStadium().equals("NULL"))
                .count();

    }
    public static List<Match> getMatchesInFirstHalfOfMonth(List<Match> matches) {
        return matches.stream()
                .filter(match -> Integer.parseInt(match.getDay()) <= 15)
                .collect(Collectors.toList());
    }
    public static List<Match> getTop3MatchesWithLargestScoreDifference(List<Match> matches, String stadium) {
        return matches.stream()
                .filter(match -> match.getStadium().equals(stadium))
                .sorted(Comparator.comparingInt(Match::getScoreDifference).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
    public static Map<String, Long> countMatchesByGuestTeams(List<Match> matches) {
        return matches.stream()
                .collect(Collectors.groupingBy(Match::getTeam2, Collectors.counting()));
    }
    public static String getMostPopularMatchDay(List<Match> matches) {
        return matches.stream()
                .collect(Collectors.groupingBy(Match::getDay, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Не найдено");
    }
}