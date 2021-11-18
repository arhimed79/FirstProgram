package lessons6;

import java.util.Arrays;
import java.util.Scanner;

public class MassivArifmSerg {
    public static void main(String[] args) {
        System.out.println("ВВедите число (длинну массива)");
        Scanner scanerData = new Scanner(System.in);
        while (!scanerData.hasNextInt()) {
            String text = scanerData.next();
            System.out.println("Введите действительные числа, а вы ввели /" + text + "/");
            System.exit(0);
        }
        int[] massivNums = getInts(scanerData);
        int min = getMin(massivNums);
        int max = getMax(massivNums);
        double averageMassiv = getSumMassiv(massivNums);

        System.out.println("массив = " + Arrays.toString(massivNums) + "\n");
        System.out.println("минимальное число в массиве = " + min + "\n" + "максимальное число в массиве = " + max);
        System.out.println("Среднееverage арифмитическое значение массива = " + averageMassiv);
    }

    public static double getSumMassiv(int[] massivNums) {
        int sum = getSum(massivNums);
        double averageMassiv = (double) sum / massivNums.length;
        return averageMassiv;
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

    public static int[] getInts(Scanner scanerData) {
        int intData = scanerData.nextInt();
        int[] massivRandom = new int[intData];
        for (int i = 0; i < massivRandom.length; i++) {
            massivRandom[i] = (int) (Math.random() * 100);
        }
        return massivRandom;
    }
}
