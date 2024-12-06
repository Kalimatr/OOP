package task6.Comparator;

import task6.Classes.Passport;

import java.util.Comparator;

public class SeriesAndNumberOfPassport implements Comparator<Passport> {

    @Override
    public int compare(Passport o1, Passport o2) {
        return o1.getSeriesAndNumberOfPassport() - o2.getSeriesAndNumberOfPassport();
    }
}
