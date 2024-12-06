package task4;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Polis {
    private int Number;

    private Date DateOfBirth;

    public Polis(int Number, Date DateOfBirth) {
        this.Number = Number;
        this.DateOfBirth = DateOfBirth;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return " \n" + "Номер карты: " + Number + "\n" + "Дата рождения: " + DateOfBirth ;
    }
}
