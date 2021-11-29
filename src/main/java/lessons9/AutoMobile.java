package lessons9;

public abstract class AutoMobile {

    public String name;
    public int distance;

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
            System.out.print("   Машина проедет  "+ i + "  из "+distance+ " \n");
        }else {
            System.out.print("   Машина не проедет  "+ i + "  из "+distance+ " \n");
        }
    }

}
