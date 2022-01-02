package lessons16;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;

import static lessons16.Runner.time;

public class LoggerThread extends Thread implements Callable<Void> {

    long end = new Date().getTime() + time;

    LoggerClass loggerClass = new LoggerClass();

    public LoggerThread(String name) {
        super(name);
    }
    @Override
    public Void call() {

        while (end > new Date().getTime()) {

            int val = getSleep();

            synchronized (LoggerClass.logger) {
                loggerClass.INFO("Вывод информвции с потока " + this.getName());
                try {
                    Thread.sleep(val);
                    loggerClass.DEBUG("поток " + this.getName() + " спал " + val / 1000 + " сек.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    loggerClass.WARNING("ошибка для потока " + this.getName());
                }
            }
        }

        return null;
    }

    private synchronized int getSleep() {
        return new Random().nextInt(6) * 1000;
    }

}


