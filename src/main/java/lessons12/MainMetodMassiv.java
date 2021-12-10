package lessons12;


import java.util.Scanner;

public class MainMetodMassiv {
    public static void main(String[] args) {

        System.out.println("Здравствуйте, давайте создадим кввадратную матрице 4 х 4");
        System.out.println("Введите кол-во строк");
        int m = getNum();
        System.out.println("Введите кол-во столбцов");
        int n = getNum();
        String[][] massiv = new String[m][n];
        String[][] array = getFill(massiv);
        print(array);
        massivContinied();
        AnalizeMassiv analizeMassiv = new AnalizeMassiv();
        try {
            System.out.println("Размерность массива каторую вы ввели  " +array.length+" на "+array[0].length);
            System.out.println("Сумма всех чисел в массивве равна " + analizeMassiv.CheckLegth(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }


    private static int getNum() {
        Scanner scanerData = new Scanner(System.in);
        int num;
        try {
            num = scanerData.nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели не целое число, по умолчанию будет присвоено = 4");
            num = 4;
        }
        return num;
    }

    private static String[][] getFill(String[][] masssiv) {
        String[][] array = new String[masssiv.length][masssiv[0].length];
        System.out.println("\n Давайте заполним массив по индексам");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("введите число в индексе " + i + " " + j);
                Scanner scanerData = new Scanner(System.in);
                array[i][j] = scanerData.next();
            }
        }
        return array;
    }

    private static void print(String[][] array) {
        System.out.println("текущий массив выглядит так");
        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void massivContinied() {
        System.out.println("Давайте проанализируем какую размерность Вы ввели и проссумируем массив," +
                " если это возможно \n Введите любой символ для начала рассчета");
        Scanner scaner = new Scanner(System.in);
        while (true) {
            if (scaner.hasNext()) break;
        }
    }
}


