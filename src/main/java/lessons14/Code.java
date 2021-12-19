package lessons14;

import java.util.Objects;

public class Code {

    public Long nambePhone;
    public String surname;
    public String name;
    public String patronomic;

    public Code(Long nambePhone, String surname, String name, String patronomic) {
        this.nambePhone = nambePhone;
        this.surname = surname;
        this.name = name;
        this.patronomic = patronomic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Code code = (Code) o;
        return Objects.equals(nambePhone, code.nambePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nambePhone);
    }

    @Override
    public String toString() {
        return "Code{" +
                "номер телефона=" + nambePhone +
                " Фамилия " + surname + '\'' +
                " Имя " + name + '\'' +
                " Отчество " + patronomic + '\'' +
                '}';
    }
}
