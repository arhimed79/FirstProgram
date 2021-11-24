package lesssons8;

import java.util.function.DoublePredicate;

public class Dog extends Animals {
    public Dog(String name, String sound) {
        super(name, sound);
    }

    public void voice() {
        System.out.print("Так звучит собака  - ");
        super.voice();
    }

    public void name() {
        System.out.print("я собака, мое имя - ");
        super.name();
    }
}
