package lessons8;

public class Cat extends Animals {

    public Cat(String name, String sound) {super(name, sound);}

    public void voice() {
        System.out.print("Так звучит кошка  - ");
        super.voice();
    }
    public void name(){
        System.out.print("я кошка, мое имя - ");
        super.name();
    }
}
