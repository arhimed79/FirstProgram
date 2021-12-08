package lessons11;

public class MyExeption extends RuntimeException {

    String name;

    MyExeption(String name) {
        this.name = name;
        System.out.println(name);
    }
}
