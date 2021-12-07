package lessons10.value1;

public class Temperature implements Convertable {


    @Override
    public void Convert(double nums[]) {
        // System.out.println(" первая цифра " + nums[0]);
        // System.out.println(" вторая  цифра " + nums[1]);
        // System.out.println(" третья цифра " + nums[2]);
        switch ((int) nums[0]) {
            case (1): {
                switch ((int) nums[1]) {
                    case (1): {
                        System.out.println("температура " + nums[2] + "*С");
                        break;
                    }
                    case (2): {
                        Celsi.CelsiToFaringeit(nums[2]);
                        break;
                    }
                    case (3): {
                        Celsi.CelsiToCelvin(nums[2]);
                        break;
                    }
                }
            }
            System.exit(0);
            case (2): {
                switch ((int) nums[1]) {
                    case (1): {
                        Faringei.FirengeitToCelsi(nums[2]);
                        break;
                    }
                    case (2): {
                        System.out.println("температура " + nums[2] + "*F");
                        break;
                    }
                    case (3): {
                        Faringei.FirengeitToCelvin(nums[2]);
                        break;
                    }
                }
            }
            System.exit(0);
            case (3): {
                switch ((int) nums[1]) {
                    case (1): {
                        Celvin.CelvinToCelsi(nums[2]);
                        break;
                    }
                    case (2): {
                        Celvin.CelvinToFirengeit(nums[2]);
                        break;
                    }
                    case (3): {
                        System.out.println("температура " + nums[2] + "*K");
                        break;
                    }
                }
            }
        }
    }
}
