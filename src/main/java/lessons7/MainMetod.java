package lessons7;


public class MainMetod {
    public static void main(String[] args) {


        CatClass murzik = new CatClass("Murzik", 3, 5, 200, false);

        int run = murzik.run(150); // Ввод значения run

        if ((run != 0)) {
            System.out.println("Мурзик пробежал " + run + " м");
        } else {
            System.out.println("Мурзик не может");
        }

        DogClass sharik = new DogClass("Sharik", 3, 3, 500, true);

        boolean dogSwim = false;// Ввод значения swim
        System.out.println("\n" + "Могут ли собаки плавать? Вы говорите что " + dogSwim);
        boolean s = sharik.swim();

        if (dogSwim & sharik.swim()) {
            System.out.println("правда, собаки плавают");
        } else {
            System.out.println("не правда, собаки могут плавать");
        }

        TigerClass sherhun = new TigerClass("Sherhun", 8, 8, 300, false);

        int jamp = sherhun.jamp(9); //Ввод значения jump
        if (jamp != 0) {
            System.out.println("\n" + "Шерхан прыгнул " + jamp + " м");
        } else {
            System.out.println("\n" + "Шерхан так далеко не прыгнет ");
        }


        int[] agearg = new int[]{murzik.getAgeer(), sharik.getAgeer(), sherhun.getAgeer()};

        int max = getMaxIndex(agearg);

        switch (max) {
            case(0):System.out.println("\n"+"Самый взрослый Мурзик, ему= " + murzik.getAgeer()+" лет");
            break;
            case(1):System.out.println("\n"+"Самый взрослый Шарик, ему= " + sharik.getAgeer()+" лет");
            break;
            case(2):System.out.println("\n"+"Самый взрослый Шерхан, ему= " + sherhun.getAgeer()+" лет");
                break;
            default:
        }
    }
    public static int getMaxIndex(int [] massiv){
        int i = 0;
        int j = 1;
        for (i=0; j<massiv.length;){
            if (massiv[i] > massiv[j]) {
                j+=1;
            }else{
                i=j;
                j+=1;
            }
        }return i;
    }
}
