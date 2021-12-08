package lessons11;

import java.util.Random;

public class MainMetodAutoKPP {

    public static void main(String[] args) {


        AutoMobileKPP Lada = new CarKPP("a111aa", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        AutoMobileKPP Uaz = new CarKPP("в222вв", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        AutoMobileKPP Opel = new CarKPP("с333сс", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        AutoMobileKPP Volvo = new CarKPP("e444ee", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        AutoMobileKPP Mersedes = new CarKPP("k555kk", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());

        AutoMobileKPP Kamaz = new TruckKPP("m666mm", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        AutoMobileKPP Scania = new TruckKPP("н777нн", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        AutoMobileKPP Man = new TruckKPP("р888рр", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        AutoMobileKPP America = new TruckKPP("т999тт", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        AutoMobileKPP Europa = new TruckKPP("у101уу", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());

        AutoMobileKPP[] cars = new CarKPP[]{(CarKPP) Lada, (CarKPP) Uaz, (CarKPP) Opel, (CarKPP) Volvo, (CarKPP) Mersedes};
        AutoMobileKPP[] trucks = new TruckKPP[]{(TruckKPP) Kamaz, (TruckKPP) Scania, (TruckKPP) Man, (TruckKPP) America, (TruckKPP) Europa};

        travelCarKPP(cars);

        System.out.println("_____________________________________________");

        travelTruksKPP(trucks);
    }

    private static void travelCarKPP(AutoMobileKPP[] cars) {
        for (AutoMobileKPP car : cars)
            car.travelKPP();
    }

    private static void travelTruksKPP(AutoMobileKPP[] trucks) {
        for (AutoMobileKPP truck : trucks)
            truck.travelKPP();
    }

    private static int RandomSpeed() {
        Random random = new Random();
        return random.nextInt(160);
    }

    private static int RandomWedth() {
        Random random = new Random();
        return random.nextInt(12);
    }

    private static double RandomWidth() {
        return (Math.random() * 3.5);
    }

    private static double RandomHign() {
        return (Math.random() * 6);
    }

}

