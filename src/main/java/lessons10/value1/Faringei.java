package lessons10.value1;

public class Faringei extends Temperature {
    public Faringei() {
    }

    public static void FirengeitToCelsi(double tempIndex) {
        double tempCelsi = (tempIndex - 32d) / 1.8;
        System.out.println("Температура " + tempIndex + " *F будет " + tempCelsi + " в *C");
    }

    public static void FirengeitToCelvin(double tempIndex) {
        double tempCelv = (tempIndex + 459.67) * (5 / 9d);
        System.out.println("Температура " + tempIndex + " *F будет " + tempCelv + " в *K");
    }
}
