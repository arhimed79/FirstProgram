package lessons14;


import java.util.*;

public class MainMetodBooks {
    public static void main(String[] args) {
        HashMap<Code, ValueContacts> myDirectory = new LinkedHashMap<>();

        for (int i = 1; i < 1000; i++) {
            Long nambe = 8917000000L + i;
            myDirectory.put(new Code(nambe, getMetodSurName(), getMetodName(), getMetodPatronomic()),
                    new ValueContacts(getMetodMyPhone(), getMetodMyPhone(), getMetodMyPhone()));
        }
        System.out.println(myDirectory.entrySet());
        //System.out.println(myDirectory.size());
        //System.out.println("__________________________________________________________");


        ArrayList<Long> countNambe = new ArrayList<>();
        for (int i = 0; i < myDirectory.size(); i++) {
            countNambe.add(i, null);
        }
        examNambePhone(myDirectory, countNambe);

        for (int k = countNambe.size() - 1; k >= 0; k--) {
            if (countNambe.get(k) != null) {
                System.out.println("Номер абонента = "+countNambe.get(k)+ " чаще всего встречается в списках других " +
                        "абонентов и равен " +k+ " раз");
                //System.out.println(myDirectory.entrySet());
                break;
            }
        }
    }

    private static void examNambePhone(HashMap<Code, ValueContacts> myDirectory, ArrayList<Long> countNambe) {
        for (Code val : myDirectory.keySet()) {
            int count = 0;
            for (ValueContacts value : myDirectory.values()) {
                if (val.nambePhone.longValue() == value.getNambePhone1() || val.nambePhone.longValue() ==
                        value.getNambePhone2() || val.nambePhone.longValue() == value.getNambePhone3()) {
                    count++;
                }
            }
            countNambe.set(count, val.nambePhone);
            System.out.println("Номер " + val.nambePhone + " встречается " + count);

        }
    }

    private static long getMetodMyPhone() {
        Random random = new Random();

        int i = random.nextInt(1200);
        return 8917000000L + i;
    }

    private static String getMetodName() {
        String[] names = {"Иван", "Александр", "Виктор", "Альберт", "Михаил", "Игорь", "Алексей", "Владимир", "Дмитрий", "Евгений"};
        Random random = new Random();
        int i = random.nextInt(10);
        return names[i];
    }

    private static String getMetodSurName() {
        String[] surNames = {"Иванов", "Киреев", "Давыдов", "Бутусов", "Башаркин", "Закиров", "Путин", "Попов", "Николаев", "Колосов"};
        Random random = new Random();
        int i = random.nextInt(10);
        return surNames[i];
    }

    private static String getMetodPatronomic() {
        String[] patronomic = {"Иванович", "Александрович", "Викторович", "Альбертович", "Михаилович", "Игоревич",
                "Алексеевич", "Владимирович", "Дмитриевич", "Евгениевич"};
        Random random = new Random();
        int i = random.nextInt(10);
        return patronomic[i];
    }
}
