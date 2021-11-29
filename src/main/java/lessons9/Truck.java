package lessons9;

public final class Truck extends AutoMobile {

    public static int dist = 1200;

    public Truck(String name, int distance) {
        super(name, distance);
    }

    public void move() {
        System.out.println(" \n Возможность проезда грузоввого автомобиля  "+name+ " на одном баке");
        super.move();
    }
}
