package code.javaInputOutput.characterOperations;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndReader {
    public static void main(String[] args) throws IOException {
        writeText("basic_programming/lesson_44/code/resources/fileWriteDemo.txt","Привет! Как дела?");
        readText("basic_programming/lesson_44/code/resources/fileWriteDemo.txt");

    }

    public static void writeText(String path, String text) throws IOException {
        FileWriter writer = new FileWriter(path);
        writer.write(text);
        writer.close();
    }

    public static void readText(String path) throws IOException {
        FileReader reader = new FileReader(path);
        int character;

        while ((character = reader.read()) != -1){
            System.out.print((char) character);
        }
    }
}
