package Bobr.l26;

class L26Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Triangle("yellow", "Russia", 3, 5, 2.4, 3.3),
                new Romb("red", "Germany", 6, 6.6),
                new Rectangle("green", "Greece", 3, 6.7, 7.6)

        };

        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println();
        }
    }
}