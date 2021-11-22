package lessons6;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFibonachiSerg {
    public static void main(String[] args) {

        int[] arroyFibonachi = new int[10];
        int[] fibonachi = getIns(arroyFibonachi);
        System.out.println("Массив изначально " + Arrays.toString(fibonachi));

        int num = getNum(fibonachi);
    }

    public static int getNum(int[] fibonachi) {
        System.out.println("ВВедите число в последовательности Фибоначи");
        Scanner scanerData = new Scanner(System.in);
        while (!scanerData.hasNextInt()) {
            String text = scanerData.next();
            System.out.println("Введите действительные числа, а вы ввели /" + text + "/");
            System.exit(ArrayFibonachiSerg.getNum(fibonachi));
        }
        int arg1 = scanerData.nextInt();
        if (arg1 >= 1) {
            System.out.println("Массив текущий из " + fibonachi.length + " чисел = " + Arrays.toString(fibonachi) + "\n");
            if (arg1 <= fibonachi.length) {
                System.out.println(arg1 + "-е е число в последовательности Фибоначи = " + fibonachi[arg1 - 1] + "\n");

                return getNum(fibonachi);// или нижняя строка
                //System.exit(ArrrayFibonachi.getNum(fibonachi, arg1));
            } else {
                int[] fibonachiPlus = new int[arg1];
                fibonachiPlus = getIns(fibonachiPlus);
                System.out.println("Массив обновленный из " + fibonachiPlus.length + " чисел = " + Arrays.toString(fibonachiPlus));
                System.out.println(arg1 + "-е е число в последовательности Фибоначи = " + fibonachiPlus[arg1 - 1] + "\n");
                fibonachi = fibonachiPlus;

                return getNum(fibonachi);
            }
        } else {
            System.out.println("необходимо ввести число от одного и выше, а вы ввели / " + arg1 + " /");
            return getNum(fibonachi);
        }
    }


    public static int[] getIns(int[] fibonachi1) {
        fibonachi1[0] = 0;
        fibonachi1[1] = 1;
        int sum = 0;
        int n1 = 0;
        int n2 = 1;
        for (int i = 2; i < fibonachi1.length; i++) {
            sum = n1 + n2;
            fibonachi1[i] = sum;
            n1 = n2;
            n2 = sum;
        }
        return fibonachi1;
    }
}
