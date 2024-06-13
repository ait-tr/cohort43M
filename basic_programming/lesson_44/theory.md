### Lesson 44


### Работа с файлами

Основные понятия Java I/O строятся вокруг потоков (streams), которые представляют собой абстракции для чтения или записи последовательности данных.
В Java I/O основное разделение идет на две большие группы: потоки байтов (byte streams) и потоки символов (character streams).
Потоки байтов используются для чтения и записи бинарных данных, в то время как потоки символов предназначены для работы с текстовыми данными.

### Потоки байтов
Основные классы для работы с байтовыми потоками - это `InputStream` и `OutputStream`. Примеры классов, наследующихся от этих абстрактных классов, включают `FileInputStream` и `FileOutputStream`.

**Пример чтения файла с использованием `FileInputStream`:**
```java
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Пример записи в файл с использованием `FileOutputStream`:**
```java
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("example.txt")) {
            String data = "Hello, World!";
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Потоки символов
Для работы с потоками символов используются классы `Reader` и `Writer`. Примеры наследников этих классов включают `FileReader` и `FileWriter`.

**Пример чтения файла с использованием `FileReader`:**
```java
import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("example.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Пример записи в файл с использованием `FileWriter`:**
```java
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("example.txt")) {
            String data = "Hello, Java!";
            fw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Буферизация
Java также предоставляет классы для буферизации ввода и вывода, такие как `BufferedReader` и `BufferedWriter`, что увеличивает эффективность операций I/O, позволяя читать или писать данные большими блоками.

**Пример чтения файла с использованием `BufferedReader`:**
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Пример записи в файл с использованием `BufferedWriter`:**
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            String data = "Hello, Buffered World!";
            bw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```


### `BufferedReader` и `BufferedWriter`

`BufferedReader` и `BufferedWriter` в Java являются частью библиотеки потоков символов, обеспечивающих буферизацию ввода и вывода.
Буферизация увеличивает эффективность чтения и записи данных, позволяя обрабатывать данные большими блоками вместо отдельных символов или массивов символов.

### BufferedReader

`BufferedReader` оборачивает другие `Reader` объекты, например, `FileReader`, добавляя буферизацию к процессу чтения.
Чтение из буфера гораздо быстрее, чем чтение из файла или сетевого потока напрямую, поскольку количество операций ввода/вывода с физическим устройством уменьшается.

**Основные методы `BufferedReader`:**

- `read()`: Читает один символ.
- `read(char[] cbuf, int off, int len)`: Читает символы в массив.
- `readLine()`: Читает строку текста. Возвращается строка содержимого или `null`, если достигнут конец потока.

**Пример использования `BufferedReader`:**

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### BufferedWriter

`BufferedWriter` оборачивает `Writer` объекты, например, `FileWriter`, добавляя буферизацию к процессу записи. Это увеличивает производительность, позволяя записывать данные блоками в буфер, а не отправлять каждый символ на физическое устройство по отдельности.

**Основные методы `BufferedWriter`:**

- `write(int c)`: Записывает один символ.
- `write(char[] cbuf, int off, int len)`: Записывает массив символов.
- `write(String s, int off, int len)`: Записывает часть строки.
- `newLine()`: Записывает системно-зависимый разделитель строк.

**Пример использования `BufferedWriter`:**

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            bw.write("Hello, Java!");
            bw.newLine();
            bw.write("BufferedWriter makes writing efficient.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Использование `BufferedReader` и `BufferedWriter` в Java является стандартной практикой для повышения производительности чтения и записи текстовых данных, особенно при работе с большими файлами или частыми операциями ввода/вывода.

