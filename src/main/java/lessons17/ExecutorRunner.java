package lessons17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int ARRAYSIZE = 1000000; // количество значений в коллекции

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < ARRAYSIZE; i++) {
            myList.add(getValue());
        }
        System.out.println(myList.toString());

        Future<Integer> min = executorService.submit(() -> {
            return Collections.min(myList);
        });
        Future<Integer> max = executorService.submit(() -> {
            return Collections.max(myList);
        });
        Future<Double> average = executorService.submit(() -> {
            int sum = 0;
            for (int i : myList) {
                sum += i;
            }
            return (sum / (double) myList.size());
        });

        while (!min.isDone() && !max.isDone() && !average.isDone()) {
            Thread.sleep(10);
            System.out.println("Работа потоков не закончена, Ждем");
        }

        System.out.println(min.get() + " - минимальное значение в коллекции \n" + max.get() + " - максимальное значение в коллекции \n"
                +average.get()+ " - среднее значение в коллекции");
        executorService.shutdown();
    }

    private static int getValue() {
        Random random = new Random();
        return random.nextInt(10000);

    }
}