package lessons9;

public abstract class AutoMobile {

    public String name;
    private int distance;

    public AutoMobile(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }


    private int dRandom() {
        int r = Math.round((float) Math.random() * 1000);
        return r;
    }

    public void move() {
        int i = dRandom();
        if (i <= distance) {
            System.out.print("   Машина проедет  " + i + "км. из " + distance + "км. \n");
        } else {
            System.out.print("   Машина не проедет  " + i + "км. из " + distance + "км. \n");
        }
    }
}
