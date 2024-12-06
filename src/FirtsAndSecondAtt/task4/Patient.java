package task4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patient implements People {
    private String Name;
    private int Age;
    private String Gender;
    private Polis polis;

    public Patient(String Name, int Age, String Gender, Polis polis) {
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
        this.polis = polis;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Polis getPolis() {
        return polis;
    }

    public void setPolis(Polis polis) {
        this.polis = polis;
    }

    public String toString() {
        return "\n" + "Имя: " + Name + "\n" + "Возраст: " + Age + "\n" + "Пол: " + Gender + polis.toString();
    }
}
