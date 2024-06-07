package code.practice.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FootballTeamDemo {
    public static void main(String[] args) {
        /*
        из коллекции команд отобрать
        - самую сильную
        - все команды из города Essen
        - получить список НАЗВАНИЙ команд из Essen
         */

        List<FootballTeam> footballTeams = new ArrayList<>();
        footballTeams.add(new FootballTeam("Dusseldorf", 7));
        footballTeams.add(new FootballTeam("Essen 2", 4));
        footballTeams.add(new FootballTeam("Berlin", 5));
        footballTeams.add(new FootballTeam("Cologne", 6));
        footballTeams.add(new FootballTeam("Dortmund", 13));
        footballTeams.add(new FootballTeam("Bonn", 6));
        footballTeams.add(new FootballTeam("Leipzig", 5));
        footballTeams.add(new FootballTeam("Essen ", 3));
        footballTeams.add(new FootballTeam("Essen 3", 3));


// в метод max() передаем через лямбду логику сравнения для компаратора (если нет правил сравнения указанных в самом классе)
        FootballTeam maxPowerTeam = footballTeams.stream()
                .max((team1,team2)-> Integer.compare(team1.getPower(), team2.getPower()))
                .orElse(null);

        System.out.println(maxPowerTeam);

// в метод max() указываем, что сравнение объектов будет происходить в "естественном порядке" -
// это применимо для классов у которых реализован интерфейс Comparable

        FootballTeam maxPowerTeam2 = footballTeams.stream()
                .max(Comparator.naturalOrder())
                .orElse(null);

        System.out.println(maxPowerTeam2);


// альтернативный вариант

        FootballTeam maxPowerTeam3 = footballTeams.stream()
                .sorted(Collections.reverseOrder())
                .findFirst()
                .orElseGet(null);

        System.out.println(maxPowerTeam3);


        // поиск всех команд из Essen

        List<FootballTeam> essenTeams = footballTeams.stream()
                .filter(team -> team.getName().contains("Essen"))
                .toList();

        System.out.println(essenTeams);

        // поиск названий всех команд из Essen

        List<String> essenTeamsNames = footballTeams.stream()
                .filter(team -> team.getName().contains("Essen"))
                .map(team -> team.getName())
                .sorted()
                .toList();

        System.out.println(essenTeamsNames);

    }
}
