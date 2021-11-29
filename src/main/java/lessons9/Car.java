package lessons9;

public final class Car extends AutoMobile {

    public static int dist = 500;

    public Car(String name, int distance) {super(name, distance);}

    public void move() {
        System.out.println(" \n Возможность проезда легкового автомобиля  " +name+ " на одном баке");
        super.move();
    }


}
