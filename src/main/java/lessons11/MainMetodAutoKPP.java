package lessons11;

import java.util.Random;

public class MainMetodAutoKPP {

    public static void main(String[] args) {


        CarKPP Lada = new CarKPP("a111aa", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        CarKPP Uaz = new CarKPP("в222вв", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        CarKPP Opel = new CarKPP("с333сс", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        CarKPP Volvo = new CarKPP("e444ee", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        CarKPP Mersedes = new CarKPP("k555kk", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());

        TruckKPP Kamaz = new TruckKPP("m666mm", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        TruckKPP Scania = new TruckKPP("н777нн", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        TruckKPP Man = new TruckKPP("р888рр", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        TruckKPP America = new TruckKPP("т999тт", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());
        TruckKPP Europa = new TruckKPP("у101уу", RandomSpeed(), RandomWedth(), RandomWidth(), RandomHign());

        AutoMobileKPP[] cars = new CarKPP[]{Lada, Uaz, Opel, Volvo, Mersedes};
        AutoMobileKPP[] trucks = new TruckKPP[]{Kamaz, Scania, Man, America, Europa};

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

