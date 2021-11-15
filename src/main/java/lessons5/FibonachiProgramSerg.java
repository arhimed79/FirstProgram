package lessons5;

import java.util.Scanner;

public class FibonachiProgramSerg {
    public static void main(String[] args) {
        System.out.println("ВВедите число в последовательности Фибоначи");
        Scanner scanerData = new Scanner(System.in);
        while (!scanerData.hasNextInt()) {
            String text = scanerData.next();
            System.out.println("Введите действительные числа от 0 до 15, а вы ввели /" + text+"/");
        }
        int intData = scanerData.nextInt();
        if (intData > 15 || intData < 1) {
            System.out.println("Вы ввели число больше 15 или меньше 1 = " + intData);
        } else if (intData == 1) {
            System.out.println(intData + "-е число в последовательности Фибоначи = 0");
        } else if (intData == 2) {
            System.out.println(intData + "-е число в последовательности Фибоначи = 1");
        } else {
            int n1 = 0;
            int n2 = 1;
            int sum = 0;
            for (int i = 2; i < intData; i++) {
                sum = n1 + n2;
                n1 = n2;
                n2 = sum;
            }
            System.out.println(intData + "-е число в последовательности Фибоначи = " + sum);

        }
    }
}
