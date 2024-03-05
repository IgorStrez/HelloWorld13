package Bobr.l27;


class Rectangle extends ShapeManager {
    private double sideA;
    private double sideB;

    public Rectangle(String color, String production, int quantity, double sideA, double sideB) {
        super(color, production, quantity);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return 2*(sideA + sideB);
    }

    @Override
    public double getTotal() {
        return quantity + this.getPerimeter() + this.getArea();
    }
}
