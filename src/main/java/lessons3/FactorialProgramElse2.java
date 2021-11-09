package lessons3;

public class FactorialProgramElse2 {
    public static void main(String[] args) {


        int num = 11; // вести число
        int rezault =1;
        int factorial = 1;


        rezault = getFactorial(num, factorial);
        System.out.println(num +"! = " + rezault);
    }

    public static int getFactorial(int arg1, int arg2) {
        if (arg1 > 1) {
            arg2  = arg2 *(arg1--);
            return getFactorial(arg1,arg2);
        } else {
            return (arg2);
        }
    }
}
