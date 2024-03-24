import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Strings in Java
        /*

         */
        String word = "Hello";

        /*
        0  1  2  3  4
        H  e  l  l  o
         */
        String java = new String("Java");
        String java1 = "Java";
        String java2 = "Java";
        String java3 = new String("Java");

        System.out.println(java1.equals(java2));
        System.out.println(java.equals(java1));
        System.out.println(java.equals(java3));

        // System.out.println(str);

        java = "Hello";

        //  методы работы со строками
        //"Hello".
        //1. метод length() - возвращает длину строки
        System.out.println(java.length());

        // toCharArray() -  преобразует строку в массив символов
        char[] helloArray = java.toCharArray();
        System.out.println(Arrays.toString(helloArray));

        // пустая строка
        String empty = "";
        String space = " ";
        System.out.println("empty length is " + empty.length());
        System.out.println("space length is " + space.length());

        // isEmpty() -  проверяет пустая ли строка/ true  если пустая
        System.out.println(empty.isEmpty());
        System.out.println(space.isEmpty());

        String str = null; //  строка не указывает на обьект

        // concat() -  также используется для обьединения строк
        String result = java.concat(space).concat("!!!");
        System.out.println(result);

        // извлечение символа - метод charAt( int index )
        String name = "John";
        // 0 1 2 3
        // J o h n

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        //   System.out.println(name.charAt(4));
        System.out.println("Last symbol of John");
        System.out.println(name.charAt(name.length() - 1));

        // равенство строк игнорируя регистр - EqualsIgnoreCase
        System.out.println("EqualsIgnoreCase");
        String ann = "ANn";
        String ann1 = "anN";
        System.out.println(ann.equalsIgnoreCase(ann1));

        // toUpperCase - переводит символы в верхний регистр
        System.out.println(ann.toUpperCase());

        //  в нижний регистр
        System.out.println(ann.toLowerCase());

        // substring() -  с помощью него можно получить часть строки
        String george = "George";
        String partOfGeorge = george.substring(2);
        System.out.println(partOfGeorge);

        System.out.println("George".substring(2,5));

        System.out.println( findHalfString("George"));

        System.out.println(isAnagram("abc","Bac"));
    }
    //  Дана строка четной длины. Написать метод, возвращающий первую половину
    //  этой строки     Java -> Ja,  George -> Geo

    public static String findHalfString( String str){
        return str.substring(0,str.length()/2);

    }
    //  Написать метод, определяющий являются ли строки анаграммами
    // rosa  rsoa
    // abc cab
    // abc
    // abc
    // abc  crb

    public static   boolean isAnagram( String str1, String str2){
        if(str1.length() != str2.length())
            return false;

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for( int i = 0; i < chars1.length; i++)
        {
            if( chars1[i] != chars2[i])
                return false;
        }
        return true;



    }
}
