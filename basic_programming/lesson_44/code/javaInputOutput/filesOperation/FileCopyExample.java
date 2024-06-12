package code.javaInputOutput.filesOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {
    public static void main(String[] args) {
        try {
            copyExample("basic_programming/lesson_44/code/resources/","pic1.jpeg","pic1_copy.jpeg");

        } catch (IOException e) {
        }
    }

    public static void copyExample(String path, String fileSource, String fileDestination) throws IOException {
      FileOutputStream outputStream = new FileOutputStream(path + fileDestination);
      FileInputStream inputStream = new FileInputStream(path + fileSource );

      int readByte = inputStream.read();

      while (readByte != -1) {
          outputStream.write(readByte);
          readByte = inputStream.read();
      }

      inputStream.close();
      outputStream.close();
    }

}
