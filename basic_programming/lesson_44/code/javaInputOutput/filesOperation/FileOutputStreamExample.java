package code.javaInputOutput.filesOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
            outputExample("test43_stream.txt");
            inputExample("test43_stream.txt");

        } catch (IOException e) {
        }
    }

    // Работа по чтению и записи в файл осуществляется ПОБАЙТНО
    // поэтому при чтении и записи английских букв проблем не возникает
    // потому что их код умещается в диапазон 0-255 (один байт)
    // но ЛЮБЫЕ другие символы вне этого диапазона будут считываться некорректно

    public static void outputExample(String path) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(path);
        String textMessage = "Привет, Мир!";
        outputStream.write(textMessage.getBytes());
        outputStream.close();
    }

    public static void inputExample(String path) throws IOException {
        FileInputStream inputStream = new FileInputStream(path);
        int data = inputStream.read();

        while (data != -1){
            System.out.println(data + " : " + (char) data);
            data = inputStream.read();
        }

        inputStream.close();
    }
}
