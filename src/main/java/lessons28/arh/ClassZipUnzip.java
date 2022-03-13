package lessons28.arh;

import lessons28.inteface.Servis;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service

public class ClassZipUnzip implements Servis {

    @Override
    public String arhZip(String course) {
        final File file = new File(course);
        final String newZipFile = FilenameUtils.removeExtension(course) + ".zip";
        try (final ZipFile zipFile = new ZipFile(file.getParent() + File.separator + FilenameUtils.getName(newZipFile))) {
            if (file.isFile()) {
                zipFile.addFile(course);
                System.out.println("Архив создан");
                file.delete();
                System.out.println("Исходный файл удален");
            } else {
                System.out.println("Исходный файл не найден");
            }
        } catch (IOException io) {
            System.out.printf("Возникли проблемы во время архивирования файла %s", course);
        }
        return FilenameUtils.removeExtension(course) + ".zip";

    }

    @Override
    public String arhUnZip(String course) {

        final ZipFile zipFile = new ZipFile(course);
        final String dir = new File(course).getParent();
        try {
            zipFile.extractAll(dir);
            System.out.println("Архив распакован");
        } catch (ZipException e) {
            System.out.println("Распаковать файл не удалось");
        }
        return null;
    }
}
