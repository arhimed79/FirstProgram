package lessons8;

public class MainMetod {
    public static void main(String[] args) {
        Cat murzik = new Cat("Мурзик", "мяу-мяу");
        Parrot kesha = new Parrot("Кеша", "Попка, дурак");
        Dog shsrik = new Dog("Шарик", "гав-гав");
        Tiger sherhun = new Tiger("Шерхан", "Ррррр-ррр");

        Animals[] animals = new Animals[]{murzik, kesha, shsrik, sherhun};
        for (Animals animals1:animals){
            animals1.name(); // Можно объединить в один метод, но в т.з. сказано вывести  voice (голос
            animals1.voice();// Можно объединить в один метод, но в т.з. сказано вывести  voice (голос

            System.out.println("------------");
        }

    }
}
