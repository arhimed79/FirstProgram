package lessons11;

public enum RestrictionsEnum {
    SPEED(80), MAXSPEED(100), MAXWEIGHT(8), MAXWIDTH(2.5), MAXHIGH(4);

    private final double num;

    RestrictionsEnum(double num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }
}
