package lessons28;

import lessons28.inteface.Servis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


@SpringBootApplication
public class ArhivMainMethod {

    private static final String NAME = "fileHomWork28.txt";

    public static void main(String[] args) throws IOException {

        String courseFile = ArhivMainMethod.createFile(NAME);
        nextRun(courseFile);

        ConfigurableApplicationContext applicationContext = SpringApplication.run(ArhivMainMethod.class, args);
        Servis aplicationContextBeen = applicationContext.getBean(Servis.class);

        String courseZip = aplicationContextBeen.arhZip(courseFile);
        nextRun2(courseZip);

        aplicationContextBeen.arhUnZip(courseZip);
    }

    private static String createFile(String name) {
        System.out.println("Введите путь до котолога \n" +
                "Например: C:\\Users\\Сергей\\IdeaProjects\\FirstProgram\\src\\main\\resources\\ \n"
                + "В этом каталоге будет создан файл с именем " + name);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String dirCourse = scanner.nextLine();
            File file28 = new File(dirCourse, name);
            try {
                file28.createNewFile();
                System.out.println("Файл в указанной папке создан");
            } catch (IOException e) {
                System.out.println("Не правильно указан путь ");
                return createFile(name);
            }
            return dirCourse + name;
        }
        return createFile(name);
    }

    private static void nextRun(String course) {
        System.out.println("\n Заполните созданный файл \n " +
                "Путь к файлу " + course + "\n В указанном котологе будет создан ZIP архив, при этом исходный файл будет удален \n" +
                "Для продолжения нажмите любую клавишу и затем Entr");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            return;
        }
    }

    private static void nextRun2(String courseZIP) {
        System.out.println("\n Нажмите любую клавишу и в катологе \n" + courseZIP+
                " \n Будет распакован файл");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            return;
        }
    }
}
