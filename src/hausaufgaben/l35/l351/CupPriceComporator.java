package hausaufgaben.l35.l351;

import java.util.Comparator;

public class CupPriceComporator implements Comparator<Cup> {
    @Override
    public int compare(Cup o1, Cup o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
