package lessons4;

public class SqrProgramSerg {
    public static void main(String[] args) {
        int num = 36;
        int value = 1;
        int sum = 0;

        for (int i = 0; value < num; i++) {
            value = i * i;
            sum = i;
        }
        if (value == num) {
            System.out.println("корень из " +num+" = "+ sum);
        } else {
            System.out.println("корень из " +num+ " не целое число, отввет лежит в диапазоне от "+ (sum - 1) + " до " + sum);
        }
    }
}
