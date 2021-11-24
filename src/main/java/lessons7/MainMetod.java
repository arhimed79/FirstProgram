package lessons7;


public class MainMetod {
    public static void main(String[] args) {


        CatClass murzik = new CatClass("Murzik", 3, 5, 200, false);
        DogClass sharik = new DogClass("Sharik", 3, 3, 500, true);
        TigerClass sherhun = new TigerClass("Sherhun", 8, 8, 300, false);

        murzik.run(190); // Ввод значения run
        sharik.swim1 (false);// Ввод значения swim
        sherhun.jamp(6); //Ввод значения jump

        int[] agearg = new int[]{murzik.getAgeer(), sharik.getAgeer(), sherhun.getAgeer()};
        int max = getMaxIndex(agearg);
        switch (max) {
            case(0):System.out.println("\n"+"Самый взрослый из животных Мурзик, ему= " + murzik.getAgeer()+" лет");
            break;
            case(1):System.out.println("\n"+"Самый взрослый из животных Шарик, ему= " + sharik.getAgeer()+" лет");
            break;
            case(2):System.out.println("\n"+"Самый взрослый из животных Шерхан, ему= " + sherhun.getAgeer()+" лет");
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
