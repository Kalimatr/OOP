package task6.Comparator;

import task6.Classes.Human;

import java.util.Comparator;

public class GenderComparator implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getGender().compareTo(o2.getGender());
    }
}