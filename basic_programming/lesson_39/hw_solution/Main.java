package Homework_39.task1;

public class Main {

        public static void main(String[] args) {
            // Лямбда-выражение для преобразования строки в верхний регистр
            StringTransformer toUpperCaseTransformer = input -> input.toUpperCase();

            // Пример строки
            String originalString = "hello world";

            // Преобразование строки с использованием лямбда-выражения
            String transformedString = toUpperCaseTransformer.transform(originalString);

            // Вывод результатов
            System.out.println("Оригинальная строка: " + originalString);
            System.out.println("Преобразованная строка: " + transformedString);
        }
    }
