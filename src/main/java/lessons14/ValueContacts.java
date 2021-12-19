package lessons14;

public class ValueContacts {
    public Long nambePhone1;
    public Long nambePhone2;
    public Long nambePhone3;

    public ValueContacts(Long nambePhone1, Long nambePhone2, Long nambePhone3) {
        this.nambePhone1 = nambePhone1;
        this.nambePhone2 = nambePhone2;
        this.nambePhone3 = nambePhone3;
    }

    public Long getNambePhone1() {
        return nambePhone1;
    }


    public Long getNambePhone2() {
        return nambePhone2;
    }

    public Long getNambePhone3() {
        return nambePhone3;
    }

    @Override
    public String toString() {
        return "ValueContacts{" +
                " номер1 = " + nambePhone1 +
                "   номер2 = " + nambePhone2 +
                "   номер3 =" + nambePhone3 +
                "} \n";
    }
}


