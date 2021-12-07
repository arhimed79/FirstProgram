package lessons9;

public abstract class AutoMobile {


    public String name;
    public static int distance;

    public AutoMobile(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }


    public static int dRandom() {
        int r = Math.round((float) Math.random() * 1000);
        return r;
    }

    public abstract void move();
}
