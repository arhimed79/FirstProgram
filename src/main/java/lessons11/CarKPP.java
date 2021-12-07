package lessons11;


public final class CarKPP extends AutoMobileKPP {

    public CarKPP(String nambe, int speed, int weight, double width, double high) {
        super(nambe, speed, weight, width, high);
    }

    @Override
    public void travelKPP() {
        System.out.println("Проверка легкового транспорта");
        examination();
    }
}



