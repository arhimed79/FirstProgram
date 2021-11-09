package lessons3;

public class ScuareEquationProgramSerg {
    public static void main(String[] args) {
        int a = 1; // введите А
        int b = 3; // введите В
        int c = 1; // введите С

        if (a != 0) {

            int Diskrimenant = (int) (Math.pow(b, 2) - (4 * a * c));
            System.out.println("Дискрименант = " + Diskrimenant);

            if (Diskrimenant < 0) {
                System.out.println("Корней нет");
            } else if (Diskrimenant == 0) {
                double x1 = rezault1(Diskrimenant, a, b, c);
                System.out.println("один корень Х = " + x1);

                //int valueProv1 =(a*Math.pow(x1))+(b*x1)+c;
                //System.out.println("Итог решения квадратного уравнения"+a+"х"+x1+"^2 +"+b+"х"+x1+ "+"+c+"="+valueProv1);
            } else {
                double x1 = rezault1(Diskrimenant, a, b, c);
                double x2 = rezault2(Diskrimenant, a, b, c);
                System.out.println("Уравнение имеет 2 еорня  Х1 = " + x1);
                System.out.println("                         Х2 = " + x2);
            }
        }else {
            System.out.println("Значение А не может быть равно 0");
        }

    }
    public static double rezault1(double D, double argA, double argB, double argC){
        return ((((-1)*(argB)) + Math.sqrt(D))/(2*argA));
    }
    public static double rezault2(double D, double argA, double argB, double argC){
        return ((((-1)*(argB)) - Math.sqrt(D))/(2*argA));
    }
}
