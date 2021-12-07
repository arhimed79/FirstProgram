package lessons10.value1;

import java.util.Scanner;

public class MainConvert {

    public static void main(String[] args) {

        System.out.println("Выберите изначальную систему счисления. \n ВВедите число от 1 до 3 \n" +
                "где \n 1- Цельсий \n 2- Форенгейт \n 3- Кельвин  ");
        int entr = getNum();

        System.out.println("Выберите систему счисления для перевода. \n ВВедите число от 1 до 3 \n" +
                "где \n 1- Цельсий \n 2- Форенгейт \n 3- Кельвин  ");
        int exit = getNum();
        double tempEnter = getTempEnter();

        double[] nums = new double[]{entr, exit, tempEnter};

        Convertable convertable = new Temperature();
        convertable.Convert(nums);

    }

    private static double getTempEnter() {
        System.out.println("Выберите температуру для перевода.\n  ВВедите число");
        Scanner scanerData = new Scanner(System.in);
        while (!scanerData.hasNextDouble()) {
            String text = scanerData.next();
            System.out.println("Введите действительные числа, а вы ввели /" + text + "/");
            return getTempEnter();
        }
        return  scanerData.nextDouble();

    }

    private static int getNum() {
        System.out.println("Введите число");
        Scanner scanerData = new Scanner(System.in);
        while (!scanerData.hasNextInt()) {
            String text = scanerData.next();
            System.out.println("Введите действительные числа, а вы ввели /" + text + "/");
            return getNum();
        }
        int num = scanerData.nextInt();

        if (num < 1 || num > 3) {
            System.out.println("Введите число от 1 до 3, а вы ввели " + num + "/");
            return getNum();
        }
        return num;
    }
}
