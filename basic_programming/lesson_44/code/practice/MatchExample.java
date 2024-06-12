package code.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
}
