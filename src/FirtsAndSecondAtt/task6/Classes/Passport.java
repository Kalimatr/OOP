package task6.Classes;

import java.time.LocalDate;
import java.util.Objects;


public class Passport implements Comparable<Passport> {
    private final LocalDate dateOfBirth;
    private final String birthplace;
    private final int seriesAndNumberOfPassport;

    public Passport(LocalDate DateOfBirth, String Birthplace, int SeriesAndNumberOfPassport) {
        this.dateOfBirth = DateOfBirth;
        this.birthplace = Birthplace;
        this.seriesAndNumberOfPassport = SeriesAndNumberOfPassport;
    }

//    @Override
//    public boolean equals(Object o){
//        if(this == o) return true;
//        if(o == null || getClass() != o.getClass()) return false;
//
//        Passport that = (Passport) o;
//        if(!(dateOfBirth.equals(that.dateOfBirth))) return false;
//        if(!(birthplace.equals(that.birthplace))) return false;
//        return seriesAndNumberOfPassport == that.seriesAndNumberOfPassport;
//    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public int getSeriesAndNumberOfPassport() {
        return seriesAndNumberOfPassport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return seriesAndNumberOfPassport == passport.seriesAndNumberOfPassport
                && Objects.equals(dateOfBirth, passport.dateOfBirth)
                && Objects.equals(birthplace, passport.birthplace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfBirth, birthplace, seriesAndNumberOfPassport);
    }

    @Override
    public int compareTo(Passport o) {
        return this.dateOfBirth.compareTo(o.dateOfBirth);
    }

    @Override
    public String toString() {
        return "Дата рождения = " + dateOfBirth + ", Место рождения = " +
                birthplace + ", Серия и номер паспорта = " + seriesAndNumberOfPassport;
    }
}
