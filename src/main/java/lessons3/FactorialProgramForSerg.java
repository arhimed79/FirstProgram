package lessons3;
// Условный оператор FOR
public class FactorialProgramForSerg {
    public static void main(String[] args) {  // считает факториал

        int num = 15; // введите число
        long factorialal = getFactorial( num );
        System.out.println("факториал " +num+ " = " + factorialal);
    }
    public static long getFactorial(int arg) {
        long rezault = 1;
        for (int i = 1; i <= arg; i++){
            rezault = rezault* i;
        }
        return rezault;
    }
}
