package task5;
import java.time.LocalDate;


public class Polis {
    private int Number;

    private LocalDate DateOfBirth;

    public Polis(int Number, LocalDate DateOfBirth) {
        this.Number = Number;
        this.DateOfBirth = DateOfBirth;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return " \n" + "Номер карты: " + Number + "\n" + "Дата рождения: " + DateOfBirth;
    }
}
