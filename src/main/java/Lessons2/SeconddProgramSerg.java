package Lessons2;
// Программа высчитывает углы треугольника по изввестным сторонам
public class SeconddProgramSerg {

    public static void main(String[] args) {

        double sideA = 7; // длинна стороныы AВ
        double sideB = 8; // длинна стороныы ВС
        double sideC = 10; // длинна стороныы AС

        double injection1 = cosAB(sideA, sideB, sideC); // угол треугольника A
        System.out.println("Угол A = " + injection1);
        double injection2 = cosBC(sideA, sideB, sideC); // угол треугольника B
        System.out.println("Угол В = " + injection2);
        double injection3 = cosAC(sideA, sideB, sideC); // угол треугольника B
        System.out.println("Угол С = " + injection3);
        double exam = injection1 + injection2 + injection3;
        System.out.println("Провверка суммы угловв  = " + exam);

    }

    public static double cosAB(double arg1, double arg2, double arg3) {

        return Math.toDegrees (Math.acos((((arg1*arg1)+(arg2*arg2)-(arg3*arg3))/(2*arg1*arg2))));

    }
    public static double cosBC(double arg1, double arg2, double arg3) {

        return Math.toDegrees (Math.acos((((arg2*arg2)+(arg3*arg3)-(arg1*arg1))/(2*arg2*arg3))));

    }

    public static double cosAC(double arg1, double arg2, double arg3) {

        return Math.toDegrees (Math.acos((((arg1*arg1) + (arg3*arg3) - (arg2*arg2)) / (2 * arg1 * arg3))));

    }
}