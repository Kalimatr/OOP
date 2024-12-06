package task6.Comparator;

import task6.Classes.Passport;

import java.util.Comparator;


public class BirthPlaceComparator implements Comparator<Passport> {

    @Override
    public int compare(Passport o1, Passport o2) {
        return o1.getBirthplace().compareTo(o2.getBirthplace());
    }
}
