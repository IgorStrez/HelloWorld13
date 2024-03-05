package Bobr.l27;

class L27Main {
    public static void main(String[] args) {
        ShapeManager[] shapes = {
                new Triangle("yellow", "Russia", 3, 5, 2.4, 3.3),
                new Romb("red", "Germany", 6, 6.6),
                new Rectangle("green", "Greece", 3, 6.7, 7.6)
        };

        for (ShapeManager shape : shapes) {
            shape.printInfo();
            System.out.println();
        }
    }
}