package lessons18;

import lombok.SneakyThrows;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class StreamRunner {

    @SneakyThrows
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("C:\\Users\\Сергей\\IdeaProjects\\FirstProgram\\src\\main\\resources\\lesss18Input.txt")) {
            try (BufferedReader reader = new BufferedReader(fileReader)) {
                String lineVerse = reader.readLine();
                int i = 1;
                while (lineVerse != null) {
                    try (FileWriter writerVerse = new FileWriter("C:\\temp_Less18\\Дом_задание_18_Строка - " + i + ".txt")) {
                        writerVerse.write(lineVerse);
                    }
                    //  System.out.println(lineVerse);
                    i++;
                    lineVerse = reader.readLine();
                }
            }
        }
    }
}
