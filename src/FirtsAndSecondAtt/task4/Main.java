package task4;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Polis polis = new Polis(112312, new Date(105, Calendar.MAY, 25, 9, 35, 0));

        Patient pat1 = new Patient("Alice", 24, "Women", polis);
        Doctor psy = new Psychologist();
        psy.setName("Ali");
        psy.setType("Psychologist");
        psy.setCabinet(357);

        Cleaner cleaner = new Cleaner("Общий", "Уборщик", "Убирать сектор №1",
                "Раксакорикофаллапаториан", 10);

        List<People> list = Arrays.asList(psy, cleaner, pat1);

        for (People s : list) {
            People people = (People) s;
            s.setAge(12);
            System.out.println(((People) s).getAge());

        }
    }
}