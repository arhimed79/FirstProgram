package lessons10.value1;

public class Temperature implements Convertable {

    private int i;
    private int j;
    private double tempIndex;


    public Temperature() {

    }

    @Override
    public void Convert(double nums[]) {
        // System.out.println(" первая цифра " + nums[0]);
        // System.out.println(" вторая  цифра " + nums[1]);
        // System.out.println(" третья цифра " + nums[2]);

        this.i  = (int) nums[0];
        this.j = (int) nums[1];
        this.tempIndex = (double) nums[2];


        switch (i) {
            case (1): {
                switch (j) {
                    case (1): {
                        System.out.println("температура " + tempIndex + "*С");
                        break;
                    }
                    case (2): {
                        Celsi.CelsiToFaringeit(tempIndex);
                        break;
                    }
                    case (3): {
                        Celsi.CelsiToCelvin(tempIndex);
                        break;
                    }
                    default:
                        break;
                }
            }
            System.exit(0);
            case (2): {
                switch (j) {
                    case (1): {
                        Faringei.FirengeitToCelsi(tempIndex);
                        break;
                    }
                    case (2): {
                        System.out.println("температура " + tempIndex + "*F");
                        break;
                    }
                    case (3): {
                        Faringei.FirengeitToCelvin(tempIndex);
                        break;
                    }
                    default:
                        break;
                }
            }
            System.exit(0);
            case (3): {
                switch (j) {
                    case (1): {
                        Celvin.CelvinToCelsi(tempIndex);
                        break;
                    }
                    case (2): {
                        Celvin.CelvinToFirengeit(tempIndex);
                        break;
                    }
                    case (3): {
                        System.out.println("температура " + tempIndex + "*K");
                        break;
                    }
                    default:
                        break;
                }
            } //System.exit(0);
            default:
                break;
        }
    }
}
