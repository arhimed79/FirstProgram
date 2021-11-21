package lessons6;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayFibonachiSerg2 {
    public static void main(String[] args) {

        int[] arroyFibonachi = new int[10];
        int num1 = 0;
        int num2 = 1;
        int num3 = 2;


        int[] fibonachi = getIns(arroyFibonachi, num1, num2, num3);
        fibonachi[0] = 0;
        fibonachi[1] = 1;

        System.out.println("Массив изначально " + Arrays.toString(fibonachi));


        int num = getNum(fibonachi);
    }

    public static int getNum(int[] fibonachi) {
        System.out.println("ВВедите число в последовательности Фибоначи");
        Scanner scanerData = new Scanner(System.in);
        while (!scanerData.hasNextInt()) {
            String text = scanerData.next();
            System.out.println("Введите действительные числа, а вы ввели /" + text + "/");
            //System.exit(0);// или
            System.exit(ArrayFibonachiSerg2.getNum(fibonachi));
        }
        int arg1 = scanerData.nextInt();
        System.out.println("Массив текущий из " + fibonachi.length + " чисел = " + Arrays.toString(fibonachi) + "\n");
        if (arg1 <= fibonachi.length) {
            System.out.println(arg1 + "-е е число в последовательности Фибоначи = " + fibonachi[arg1 - 1] + "\n");

            return getNum(fibonachi);// или нижняя строка
            //System.exit(ArrrayFibonachi.getNum(fibonachi, arg1));
        } else {
            int[] fibonachiPlus = new int[arg1];
            System.arraycopy (fibonachi, 0,fibonachiPlus,0, fibonachi.length);
            int n1 = fibonachi [fibonachi.length -2];
            int i = fibonachi.length - 1;
            int n2 = fibonachi[i];
            int n3 = fibonachi.length;
            fibonachiPlus = getIns(fibonachiPlus, n1, n2, n3);

            System.out.println("Массив обновленный из " + fibonachiPlus.length + " чисел = " + Arrays.toString(fibonachiPlus));
            System.out.println(arg1 + "-е е число в последовательности Фибоначи = " + fibonachiPlus[arg1 - 1] + "\n");

            fibonachi = fibonachiPlus;
            return getNum(fibonachi);// или нижняя строка
            //System.exit(ArrrayFibonachi.getNum(fibonachi, arg1));
        }
        // return arg1; // если используется нижняя строка
    }

    public static int[] getIns(int[] fibonachi1, int argN1, int argN2, int arg3) {
        int sum;
        for (int i = arg3; i < fibonachi1.length; i++) {
            sum = argN1 + argN2;
            fibonachi1[i] = sum;
            argN1 = argN2;
            argN2 = sum;
        }
        return fibonachi1;
    }
}

