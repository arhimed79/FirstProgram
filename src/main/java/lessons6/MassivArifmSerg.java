package lessons6;

import javax.security.sasl.SaslClientFactory;
import java.util.Arrays;
import java.util.Scanner;

public class MassivArifmSerg {
    public static void main(String[] args) {
        System.out.println("ВВедите число (длинну массива)");
        Scanner scanerData = new Scanner(System.in);
        while (!scanerData.hasNextInt()) {
            String text = scanerData.next();
            System.out.println("Введите действительные числа, а вы ввели /" + text + "/");
            return;
        }
        int inData = scanerData.nextInt();
        int[] massivNums = getInts(inData);
        int min = getMin(massivNums);
        int max = getMax(massivNums);
        double averageMassiv = getAverageMassiv(massivNums);

        System.out.println("массив = " + Arrays.toString(massivNums) + "\n");
        System.out.println("минимальное число в массиве = " + min + "\n" + "максимальное число в массиве = " + max);
        System.out.println("Среднееverage арифмитическое значение массива = " + averageMassiv);
    }

    public static double getAverageMassiv(int[] massivNums) {
        int sum = getSum(massivNums);
        return  (double) sum / massivNums.length;

    }

    public static int getMax(int[] massivNums) {
        int max = Arrays.stream(massivNums).max().getAsInt();
        return max;
    }

    public static int getMin(int[] massivNums) {
        int min = Arrays.stream(massivNums).min().getAsInt();
        return min;
    }

    public static int getSum(int[] massivSum) {
        int sum = 0;
        for (int k = 0; k < massivSum.length; k++) {
            sum += massivSum[k];
        }
        return sum;
    }

    public static int[] getInts(int data) {
        int[] massivRandom = new int[data];
        for (int i = 0; i < massivRandom.length; i++) {
            massivRandom[i] = (int) (Math.random() * 100);
        }
        return massivRandom;
    }
}
