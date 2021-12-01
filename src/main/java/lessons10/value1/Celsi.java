package lessons10.value1;

public class Celsi extends Temperature {

    public Celsi(int i, int j, double tempIndex) {
    }

    public static void CelsiToFaringeit(double tempIndex) {
        double tempFor = tempIndex * 1.8d + 32;
        System.out.println("Температура " + tempIndex + " *С будет " + tempFor + " в *F");
    }

    public static void CelsiToCelvin(double tempIndex) {
        double tempCelv = tempIndex + 273;
        System.out.println("Температура " + tempIndex + " *С будет " + tempCelv + " в *K");
    }
}

