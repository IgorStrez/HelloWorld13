package Bobr.l35;

import java.util.Comparator;

public class NameComparator implements Comparator<Bobr> {

    @Override
    public int compare(Bobr b1, Bobr b2) {
        return b1.getName().compareTo(b2.getName());
    }
}
