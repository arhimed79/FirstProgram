package lessons8;

public class Parrot extends Animals {
    public Parrot(String name, String sound) {
        super(name, sound);
    }

    public void voice() {
        System.out.print("Так звучит попугай  - ");
        super.voice();
    }

    public void name(){
        System.out.print("я попугай, мое имя - ");
        super.name();
    }
}
