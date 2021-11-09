package lessons3;

public class FactorialProgramElse2Serg {
    public static void main(String[] args) {


        int num = 15; // вести число
        long rezault =1;
        int factorial = 1;


        rezault = getFactorial(num, factorial);
        System.out.println(num +"! =\t" + rezault);
    }

    public static long getFactorial(int arg1, long arg2) {
        if (arg1 > 1) {
            arg2  = arg2 *(arg1--);
            return getFactorial(arg1,arg2);
        } else {
            return (arg2);
        }
    }
}
