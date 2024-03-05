package Bobr.l35;

import java.util.Comparator;

public class RelativesCountComparator implements Comparator <Bobr> {

    @Override
    public int compare(Bobr b1, Bobr b2) {
        return Integer.compare(b1.getRelativesCount(), b2.getRelativesCount());
    }
}
