package lessons9;

import static java.nio.file.Files.move;

public class MainMetodAuto {
    public static void main(String[] args) {

        Car Lada = new Car("Лада", Car.dist);
        Car Uaz = new Car("Уаз", Car.dist);
        Car Opel = new Car("Опель", Car.dist);
        Car Volvo = new Car("Вольво", Car.dist);
        Car Mersedes = new Car("Мерседес", Car.dist);

        Truck Kamaz = new Truck("Камаз", Truck.dist);
        Truck Scania = new Truck("Скания", Truck.dist);
        Truck Man = new Truck("Ман", Truck.dist);
        Truck America = new Truck("Америка", Truck.dist);
        Truck Europa = new Truck("Европа", Truck.dist);

        AutoMobile[] cars = new Car[]{Lada, Uaz, Opel, Volvo, Mersedes};
        AutoMobile[] trucks = new Truck[]{Kamaz, Scania, Man, America, Europa};

        for (AutoMobile car : cars) {
            car.move();
        }
        System.out.println("_____________________________________________");
        for (AutoMobile truck : trucks) {
            truck.move();
        }
    }
}

