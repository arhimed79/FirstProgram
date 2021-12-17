package lessons13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MainMetodArray {
    public static void main(String[] args) {
        System.out.println("Здравствуйте пользователь");
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(0, "Иванов И. И.", RandomWorkAge()));
        employees.add(new Employee(1, "Петров П. А.", RandomWorkAge()));
        employees.add(new Employee(2, "Сидоров А.К.", RandomWorkAge()));
        employees.add(new Employee(3, "Пушкин А. С.", RandomWorkAge()));
        employees.add(new Employee(4, "Лермонтов М. Ю.", RandomWorkAge()));
        employees.add(new Employee(5, "Крылов И. А.", RandomWorkAge()));
        employees.add(new Employee(6, "Гоголь Н. В.", RandomWorkAge()));
        employees.add(new Employee(7, "Есенин С. А.", RandomWorkAge()));
        employees.add(new Employee(8, "Блок А. А.", RandomWorkAge()));
        employees.add(new Employee(9, "Мояковский В. В.", RandomWorkAge()));
        employees.add(new Employee(10, "Цветаева М. И.", RandomWorkAge()));
        employees.add(new Employee(11, "Ахматова А. А.", RandomWorkAge()));
        employees.add(new Employee(12, "Бунин И. А.", RandomWorkAge()));
        employees.add(new Employee(13, "Тургенев И. С.", RandomWorkAge()));
        employees.add(new Employee(14, "Куприн А. И.", RandomWorkAge()));
        employees.add(new Employee(15, "Чайковский  П. И.", RandomWorkAge()));
        employees.add(new Employee(16, "Некрасов Н. А.", RandomWorkAge()));
        employees.add(new Employee(17, "Грибоедов А. С.", RandomWorkAge()));
        employees.add(new Employee(18, "Бродский И. А.", RandomWorkAge()));
        employees.add(new Employee(19, "Пастернак Б. Л.", RandomWorkAge()));

        System.out.println("Список сотрудников в фирме" + employees+"\n");
        System.out.println("Будет произведен поиск сотрудников с указанным стажем");

        int numWorkAge = getWorkAge();
        System.out.println("Список сотрудников с указанным стажем работы \n");

        examenationWorkAge(employees, numWorkAge);
        System.out.println();
        System.out.println("В связи с уменьшение издержек будут уволены сотрудники с нечетным индексом \n");
        Continied();
        IndexCheck(employees);
        System.out.println("Текущий список сотрудников в фирме" + employees);


    }

    private static void IndexCheck(ArrayList<Employee> employees) {
        for (int i = (employees.size() - 1); i > 0; i--) {
            Employee value = employees.get(i);
            if (i % 2 != 0) {
                System.out.println("Сотрудник " + value.getFIO() + " уволен, его ID= " +value.getID());
                employees.remove(i);
            }
        }
        System.out.println();
    }

    private static void Continied() {
        System.out.println("Введите любой символ");
        Scanner scaner = new Scanner(System.in);
        while (true) {
            if (scaner.hasNext()) break;
        }
    }

    private static void examenationWorkAge(ArrayList<Employee> employees, int numWorkAge) {
        for (Iterator<Employee>iterator = employees.iterator();iterator.hasNext(); ){
             Employee value = iterator.next();
            if (numWorkAge == value.getWorkAge()) {
                System.out.println("Сотрудник " + value.getFIO() + " имееют стаж " + numWorkAge + " года");
            }
        }
    }

    private static int RandomWorkAge() {
        Random random = new Random();
        return random.nextInt(9);
    }

    public static int getWorkAge() {
        System.out.println("Введите стаж работы. от 0 до 9 лет");
        Scanner scanerData = new Scanner(System.in);
        int num;
        try {
            num = scanerData.nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели невверныые данныые, по умолчанию будет присвоено = 4");
            return 4;
        }
        if (num < 1 || num > 9) {
            System.out.println("Вы ввели невверныые данныые, по умолчанию будет присвоено = 4");
            return 4;
        }
        return num;

    }
}
