package task6.Classes;

import task6.Comparator.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
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


        equalsHuman(human1, human2);
        equalsHuman(human1, human5);

        equalsHumanHash(human1, human2);
        equalsHumanHash(human1, human5);

        ArrayList<Human> list = new ArrayList<>();
        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);

        String perforation = "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";

        Collections.sort(list);
        System.out.println(list + perforation);

        GenderComparator genderComparator = new GenderComparator();
        Collections.sort(list, genderComparator);
        System.out.println(list + perforation);

        NameComparator nameComparator = new NameComparator();
        Collections.sort(list,nameComparator);
        System.out.println(list + perforation);
    }

    private static void equalsHuman(Human human1, Human human2) {
        if (human1.equals(human2)) {
            System.out.println("Один и тот же человек\n");
        } else {
            System.out.println("Два разных человека\n");
        }
    }

    private static void equalsHumanHash(Human human1, Human human2) {
        if (human1.hashCode() == human2.hashCode()) {
            System.out.println("Один и тот же хэш\n");
        } else {
            System.out.println("Два разных хэша\n");
        }
    }
}
