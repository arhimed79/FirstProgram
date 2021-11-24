package lessons7;

public class CatClass {
    String name;
    int ageer;
    int jumper;
    int runer;
    boolean swimer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CatClass(String name, int ageer, int jumper, int runer, boolean swimer) {
        this.name = name;
        this.ageer = ageer;
        this.jumper = jumper;
        this.runer = runer;
        this.swimer = swimer;
    }

    public int getAgeer() {
        return ageer;
    }

    public void setAgeer(int ageer) {
        this.ageer = ageer;
    }

    public int getJumper() {
        return jumper;
    }

    public void setJumper(int jumper) {
        this.jumper = jumper;
    }

    public int getRuner() {
        return runer;
    }

    public void setRuner(int runer) {
        this.runer = runer;
    }

    public boolean isSwimer() {
        return swimer;
    }

    public void setSwimer(boolean swimer) {
        this.swimer = swimer;
    }

    public void run(int k) {
        if (k <= this.runer) {
            System.out.println("\n" + "Мурзик пробежал " + k + " м");
        } else {
            System.out.println("\n" + "Мурзик не может");
        }
    }
}
