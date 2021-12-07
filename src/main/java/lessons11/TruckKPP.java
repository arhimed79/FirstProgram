package lessons11;

public final class TruckKPP extends AutoMobileKPP {

    public TruckKPP(String nambe, int speed, int weight, double width, double high) {
        super(nambe, speed, weight, width, high);
    }

    @Override
    public void travelKPP() {
        System.out.println("Проверка грузового транспорта");
        examination();
    }
}


