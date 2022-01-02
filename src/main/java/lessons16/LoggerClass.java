package lessons16;

import java.util.logging.LogManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoggerClass {

    public static final Logger logger = Logger.getLogger(LoggerClass.class.getName());

    public void LoggerClass1() {

        try {
            LogManager.getLogManager().readConfiguration();
            System.out.println("Загрузка нового файла конфигурации - успешно");
        } catch (Exception e) {
            System.out.println("Не найден файл конфигурации" + e);
        }
    }
    public void INFO (String text) {
        logger.log(Level.INFO, text);
    }
    public void DEBUG (String text) {
        logger.log(Level.FINE, text);
    }
    public void WARNING (String text) {
        logger.log(Level.WARNING, text);
    }
}





