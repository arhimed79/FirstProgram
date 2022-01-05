package lessons18;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StreamRunner {

    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(() -> {
            try (FileReader fileReader = new FileReader("C:\\Users\\Сергей\\IdeaProjects\\FirstProgram\\src\\" +
                    "main\\resources\\lesss18Input.txt")) {
                try (BufferedReader reader = new BufferedReader(fileReader)) {
                    String lineVerse = reader.readLine();
                    int i = 1;
  //                  System.out.println("Работает поток "+Thread.currentThread().getName());
                    while (lineVerse != null) {
                        try (FileWriter writerVerse = new FileWriter("C:\\temp_Less18\\Дом_задание_18_Строка - " + i + ".txt")) {
                            writerVerse.write(lineVerse);
                        }
                        i++;
                        lineVerse = reader.readLine();
                    }
                }
            }catch (Exception e) {
                System.out.println("Ошибка чтения из файла");
            }
        });
        executorService.shutdown();
 //       while (!executorService.isTerminated()){
  //          System.out.println("Поток  "+Thread.currentThread().getName()+" спит");
  //          Thread.sleep(10);
   //     }
  //      System.out.println("Работает поток "+Thread.currentThread().getName());
    }
}
