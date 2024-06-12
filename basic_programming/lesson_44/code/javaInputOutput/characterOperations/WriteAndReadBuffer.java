package code.javaInputOutput.characterOperations;

import java.io.*;

public class WriteAndReadBuffer {
    public static void main(String[] args) throws IOException {
        String path = "basic_programming/lesson_44/code/resources/fileWriteBufferedDemo.txt";
        writeBufferFile(path);
        readBufferFile(path);

    }

    public static void writeBufferFile(String path) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write("Hello, World!");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("Как дела?");
        bufferedWriter.newLine();
        bufferedWriter.write("Все отлично!");
        bufferedWriter.close();

    }

    public static void readBufferFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("basic_programming/lesson_44/code/resources/fileWriteBufferedDemoCopy.txt"));

        String line;

        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}
