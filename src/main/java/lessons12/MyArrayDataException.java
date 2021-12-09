package lessons12;

public class MyArrayDataException extends Exception{


    MyArrayDataException(int m, int n) {
        super("Неверно внесеныы данныые в ячейке "+m+ " "+n);
    }
}

