package hausaufgaben.l35.l351;

public class Main {
    public static void main (String[] args) {
        Cup cup1 = new Cup(400, "While", 5);
        Cup cup2 = new Cup(400, "Blue", 4.5);

        int c = cup1.compareTo(cup2);

        if (c > 0) {
            System.out.println("Cup 1 is Larger!");
        } else if (c < 0) {
            System.out.println("Cup 2 is Larger!");
        } else {
            System.out.println("Cups are equal!");

        }

        int priceC = new CupPriceComporator().compare(cup1,cup2);

        if (priceC > 0) {
            System.out.println("Cup 1 is more expensive!");
        } else if (priceC < 0) {
            System.out.println("Cup 2 is more expensive!");
        } else {
            System.out.println("Cups` prices are equal!");

        }
    }
}
