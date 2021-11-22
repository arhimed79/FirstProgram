package lessons7;


public class MainMetod {
    public static void main(String[] args) {


        CatClass murzik = new CatClass("Murzik", 3, 5, 200, false);
        DogClass sharik = new DogClass("Sharik", 3, 3, 500, true);
        TigerClass sherhun = new TigerClass("Sherhun", 8, 8, 300, false);

        int run = murzik.run(200); // Ввод значения run
        boolean dogSwim = false;// Ввод значения swim
        int jamp = sherhun.jamp(8); //Ввод значения jump

        if ((run != 0)) {
            System.out.println("\n"+"Мурзик пробежал " + run + " м");
        } else {
            System.out.println("\n"+"Мурзик не может");
        }

        System.out.println("\n" + "Могут ли собаки плавать? Вы говорите что " + dogSwim);

        if (dogSwim && sharik.swim()) {
            System.out.println("Ответ: правда, собаки плавают");
        } else {
            System.out.println("Ответ: не правда, собаки могут плавать");
        }

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
