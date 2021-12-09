package lessons12;

public class AnalizeMassiv {

    private final int m;
    private final int n;

    public AnalizeMassiv(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public AnalizeMassiv() {
        this(4, 4);
    }

    public int CheckLegth(String[][] massiv) throws MyArrayDataException {
        int sum = 0;
        if (this.m != massiv.length)  throw new MyArraySizeException("Вы ввели неверное количество строк.\n Вас просили ввести " + this.m +
                    " а вы ввели " + massiv.length);

        for (int i = 0; i < massiv.length; i++) {
            if (this.n != massiv[i].length)  throw new MyArraySizeException("Вы ввели неверное количество столбцов.\n Вас просили ввести " + this.n +
                        " а вы ввели " + massiv[0].length);
            for (int j = 0; j < massiv[i].length; j++) {
                    try {
                        sum += Integer.parseInt(massiv[i][j]);
                    } catch (NumberFormatException e) {
                        throw  new MyArrayDataException(i, j);
                    }
                }
            }
        return sum;
        }
    }

