package lessons10.value1;

public class Celvin extends Temperature {
    public Celvin() {
    }


    public static void CelvinToCelsi(double tempIndex) {
        double tempCelsi = tempIndex - 273;
        System.out.println("Температура " + tempIndex + " *K будет " + tempCelsi + " в *C");
    }

    public static void CelvinToFirengeit(double tempIndex) {
        double tempFir = 1.8 * (tempIndex - 273) + 32d;
        System.out.println("Температура " + tempIndex + " *K будет " + tempFir + " в *F");
    }
}
