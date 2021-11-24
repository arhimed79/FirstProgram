package lesssons8;

public class Animals {

    private String name;
    private String sound;

    public Animals(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
    public void voice () {
       System. out.println(sound);
    }

    public void name() {
        System.out.println(name);
    }
}
