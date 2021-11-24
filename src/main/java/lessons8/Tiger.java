package lessons8;

public class Tiger extends Animals{

    public Tiger(String name, String sound) {super(name, sound);}

    public void voice() {
        System.out.print("Так звучит тигр  -  ");
        super.voice();
    }
    public void name(){
        System.out.print("я тигр, мое имя - ");
        super.name();
    }
}
