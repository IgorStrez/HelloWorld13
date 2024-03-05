package hausaufgaben.l27;


class Romb extends ShapeManager {
    private double side;

    public Romb(String color, String production, int quantity, double side) {
        super(color, production, quantity);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getTotal() {
        return quantity + this.getPerimeter() + this.getArea();
    }
}