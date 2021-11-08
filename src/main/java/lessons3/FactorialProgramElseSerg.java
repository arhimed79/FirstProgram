package lessons3;
   // Условный оператор ELSE
public class FactorialProgramElseSerg {
    public static void main(String[] args) {  // считает факториал в диапазоне от 0 до 10
        int nam = 1; // ввести число

        if (nam == 0) {
            int fractal = 1;
            System.out.println("факториал = " + fractal);
        } else if (nam == 1) {
            int fractal = 1;
            System.out.println("факториал = " + fractal);
        } else if (nam == 2) {
            int fractal = 1 * 2;
            System.out.println("факториал = " + fractal);
        } else if (nam == 3) {
            int fractal = 1 * 2 * 3;
            System.out.println("факториал = " + fractal);
        } else if (nam == 4) {
            int fractal = 1 * 2 * 3 * 4;
            System.out.println("факториал = " + fractal);
        } else if (nam == 5) {
            int fractal = 1 * 2 * 3 * 4 * 5;
            System.out.println("факториал = " + fractal);
        } else if (nam == 6) {
            int fractal = 1 * 2 * 3*4*5*6;
            System.out.println("факториал = " + fractal);
        }else if (nam == 7) {
            int fractal = 1 * 2 * 3*4*5*6*7;
            System.out.println("факториал = " + fractal);
        }else if (nam == 8) {
            int fractal = 1 * 2 * 3*4*5*6*7*8;
            System.out.println("факториал = " + fractal);
        }else if (nam == 9) {
            int fractal = 1 * 2 * 3*4*5*6*7*8*9;
            System.out.println("факториал = " + fractal);
        }else if (nam == 10) {
            int fractal = 1 * 2 * 3*4*5*6*7*8*9*10;
            System.out.println("факториал = " + fractal);
        }else {
            System.out.println("Вы ввели число больше 10 ");
        }
    }
}



