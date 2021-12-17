package lessons13;


public class Employee {

    public Integer ID;
    public String FIO;
    public Integer workAge;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public  String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {

        this.FIO = FIO;
    }

    public Integer getWorkAge() {

        return workAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", FIO='" + FIO + '\'' +
                ", workAge=" + workAge +
                '}';
    }

    public Employee(Integer ID, String FIO, Integer workAge) {
        this.ID = ID;
        this.FIO = FIO;
        this.workAge = workAge;


    }
}


