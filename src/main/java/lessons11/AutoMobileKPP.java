package lessons11;

public abstract class AutoMobileKPP {

    String nambe;// номер
    int speed;// скорость
    int weight; // масса
    double width;// ширина
    double high;// высота
    double longer;// длинна

    public AutoMobileKPP(String nambe, int speed, int weight, double width, double high) {
        this.nambe = nambe;
        this.speed = speed;
        this.weight = weight;
        this.width = width;
        this.high = high;
    }

    public abstract void travelKPP();

    public void examination1() {

            if (speed > RestrictionsEnum.MAXSPEED.getNum()) {
                throw new MyExeption("Очень высокая скорость " + speed + " км/ч. доступ запрещен. г.н. " + nambe +
                        " отправлен в полицию");
            } else if (speed > RestrictionsEnum.SPEED.getNum()) {
                throw new MyExeption("Высокая скорость " + speed + " км/ч. доступ запрещен. г.н. " + nambe);
            } else if (weight > RestrictionsEnum.MAXWEIGHT.getNum()) {
                throw new MyExeption("Большой вес, " + weight + " т. доступ запрещен. г.н. " + nambe);
            } else if (high > RestrictionsEnum.MAXHIGH.getNum()) {
                throw new MyExeption("Большая высота, " + high + " м. доступ запрещен. г.н. " + nambe);
            } else if (width > RestrictionsEnum.MAXWIDTH.getNum()) {
                throw new MyExeption("Большая ширина, " + width + " м. доступ запрещен. г.н. " + nambe);
            } else {
                System.out.println("Машина " + nambe + " проехала на КПП. Скорость " + speed + " км/ч. Вес " + weight + " т. Ширина "
                        + width + " м. Высота " + high + " м.\n");
            }
        }
    }

