package task6.Test;


import task6.Comparator.*;
import task6.Classes.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;


public class tests {

    Passport passport1 = new Passport(LocalDate.of(1989, Calendar.DECEMBER, 7),
            "Токио", 2003777777);
    Human human1 = new Human("Сатору Годзе", "Мужской", passport1);

    Passport passport2 = new Passport(LocalDate.of(2000, Calendar.NOVEMBER, 21),
            "Москва", 201456534);
    Human human2 = new Human("Алиса Каменева", "Женский", passport2);

    Passport passport3 = new Passport(LocalDate.of(1839, Calendar.AUGUST, 30),
            "Сталинград", 1993884423);
    Human human3 = new Human("Зинаида Ковалева", "Женский", passport3);

    Passport passport4 = new Passport(LocalDate.of(2010, Calendar.OCTOBER, 27),
            "Санкт-Петербург", 2023111345);
    Human human4 = new Human("Алексей Романов", "Мужской", passport4);

    Human human5 = new Human("Сатору Годзе", "Мужской", passport1);
    Human human6 = new Human("Сатору Годзе", "Мужской", passport1);

    @Test
    public void equalsHuman() {
        Assertions.assertEquals(human1, human1); //рефлексивность

        Assertions.assertEquals(human1, human5);//Симметричность
        Assertions.assertEquals(human5, human1);

        Assertions.assertEquals(human1, human5);//Транзитивность
        Assertions.assertEquals(human5, human6);
        Assertions.assertEquals(human1, human6);

        Assertions.assertEquals(human5, human6);//Постоянность
        Assertions.assertEquals(human5, human6);

        Assertions.assertNotEquals(human1, null);// неравенство с null
    }

    @Test
    public void hashCodeHuman(){
        Assertions.assertEquals(human1.hashCode(), human5.hashCode());//у равных объектов один hashCode
        Assertions.assertEquals(human5.hashCode(), human6.hashCode());
        Assertions.assertEquals(human1.hashCode(), human6.hashCode());
    }
    @Test
    public void sortPassport(){
        List<Passport> PassportList = Arrays.asList(passport1,passport2,passport3,passport4);
        Collections.sort(PassportList);
    }

    @Test
    public void sortPassportComparator(){
        List<Passport> PassportList = Arrays.asList(passport1,passport2,passport3,passport4);
        BirthPlaceComparator birthPlaceComparator = new BirthPlaceComparator();
        Collections.sort(PassportList,birthPlaceComparator);

        SeriesAndNumberOfPassport seriesAndNumberOfPassport = new SeriesAndNumberOfPassport();
        Collections.sort(PassportList,seriesAndNumberOfPassport);
    }

    @Test
    public void sortHuman(){
        List<Human> HumanList = Arrays.asList(human1,human2,human3,human4,human5);
        Collections.sort(HumanList);
    }

    @Test
    public void sortHumanComparator(){
        List<Human> HumanList = Arrays.asList(human1,human2,human3,human4,human5);
        GenderComparator genderComparator = new GenderComparator();
        Collections.sort(HumanList, genderComparator);

        NameComparator nameComparator = new NameComparator();
        Collections.sort(HumanList,nameComparator);
    }

}