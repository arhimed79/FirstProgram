package Lessons2;

// Программа высчитывает углы треугольника по изввестным сторонам
public class SeconddProgramSerg {

    public static void main(String[] args) {

        double sideA = 3; // длинна стороныы AВ
        double sideB = 4; // длинна стороныы ВС
        double sideC = 5; // длинна стороныы AС

        double injection1 = cosAB(sideA, sideB, sideC); // угол треугольника A
        System.out.println("Угол A = " + injection1 + " Град.");
        double injection2 = cosBC(sideA, sideB, sideC); // угол треугольника B
        System.out.println("Угол В = " + injection2 + " Град.");
        double injection3 = cosAC(sideA, sideB, sideC); // угол треугольника B
        System.out.println("Угол С = " + injection3 + " Град.");
        double exam = injection1 + injection2 + injection3;
        System.out.println("Провверка суммы углов  = " + exam + " Град.");

    }

    public static double cosAB(double arg1, double arg2, double arg3) {

        return Math.toDegrees(Math.acos(((Math.pow(arg1, 2)) + (Math.pow(arg2, 2)) - (Math.pow(arg3, 2))) / (2 * arg1 * arg2)));

    }

    public static double cosBC(double arg1, double arg2, double arg3) {

        return Math.toDegrees(Math.acos(((Math.pow(arg2, 2)) + (Math.pow(arg3, 2)) - (Math.pow(arg1, 2))) / (2 * arg2 * arg3)));

    }

    public static double cosAC(double arg1, double arg2, double arg3) {

        return Math.toDegrees(Math.acos(((Math.pow(arg1, 2)) + (Math.pow(arg3, 2)) - (Math.pow(arg2, 2))) / (2 * arg1 * arg3)));

    }
}
