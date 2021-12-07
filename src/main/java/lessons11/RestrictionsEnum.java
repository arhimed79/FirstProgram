package lessons11;

public enum RestrictionsEnum {
    SPEED(80), MAXSPEED(100), MAXWEIGHT(8), MAXWIDTH(2.5), MAXHIGH(4);


    private double num;
    private String name;

RestrictionsEnum(double num) {this.num = num;}

    RestrictionsEnum(double num, String name) {
        this.num = num;
        this.name = name;
    }

    public double getNum() {
        return num;
    }
}
