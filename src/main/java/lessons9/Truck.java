package lessons9;

public final class Truck extends AutoMobile {

    public static int dist = 1200;

    public Truck(String name, int distance) {
        super(name, distance);
    }

    public void move() {
        System.out.println(" \n Возможность проезда грузоввого автомобиля  "+name+ " на одном баке");
        int i = AutoMobile.dRandom();
        if (i <= dist) {
            System.out.print("   Машина проедет  " + i + "км. из " + dist + "км. \n");
        } else {
            System.out.print("   Машина не проедет  " + i + "км. из " + dist + "км. \n");

        }
    }
}
