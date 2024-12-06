package task6.Comparator;

import task6.Classes.Human;

import java.util.Comparator;

public class NameComparator implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getNameAndSurname().compareTo(o2.getNameAndSurname());
    }
}
