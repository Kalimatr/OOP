package task6.Classes;

import java.util.Objects;

public class Human implements Comparable<Human> {
    private String nameAndSurname;
    private String gender;
    private Passport passport;

    public Human(String NameAndSurname, String Gender, Passport Passport) {
        this.nameAndSurname = NameAndSurname;
        this.gender = Gender;
        this.passport = Passport;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public String getGender() {
        return gender;
    }

    public Passport getPassport() {
        return passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human that = (Human) o;
        if (!(nameAndSurname.equals(that.nameAndSurname))) return false;
        if (!(gender.equals(that.gender))) return false;
        return passport.equals(that.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAndSurname, gender, passport);
    }

    @Override
    public int compareTo(Human o) {
        return this.passport.compareTo(o.passport);
    }

    @Override
    public String toString() {
        return "\n\nИмя и фамилия = " + nameAndSurname + ", пол = " + gender + ", \nДанные паспорта:\n" + passport;
    }
}
