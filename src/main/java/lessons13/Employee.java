package lessons13;


public class Employee {

    public Integer ID;
    public String FIO;
    public Integer workAge;

    public Integer getID() {
        return ID;
    }


    public  String getFIO() {
        return FIO;
    }

    public Integer getWorkAge() {

        return workAge;
    }

    @Override
    public String toString() {
        return "\n Сотрудник {" +
                "ID= " + ID +
                "  ФИО \\" + FIO +
                "\\ стаж работы = " + workAge+
                " года}";
    }

    public Employee(Integer ID, String FIO, Integer workAge) {
        this.ID = ID;
        this.FIO = FIO;
        this.workAge = workAge;
    }
}


