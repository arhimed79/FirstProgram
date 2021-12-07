package lessons11;

public class MyExeption extends Exception {

    String name;

    MyExeption(String name) {
        this.name = name;
        System.out.println(name);
    }
}
