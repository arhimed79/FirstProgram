package lessons16;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Runner {

    public static final int time = 10000;


    public static void main(String[] args) throws InterruptedException {

        LoggerClass loggerClass = new LoggerClass();
        loggerClass.LoggerClass1();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<Void>> threads = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            threads.add(new LoggerThread("Поток " + i));
        }
        executorService.invokeAll(threads);

        executorService.shutdown();
        if (executorService.isShutdown()) {
            loggerClass.DEBUG("Дополнительные потоки закончили работу_______________");
            Thread.sleep(100);
        }

        // здесь я не могу найти файл с логами, чтоб потом считать его
        System.out.println("Логирование выведена в консоль");
    }
}
