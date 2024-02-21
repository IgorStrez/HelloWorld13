package hausaufgaben.l27;

class Triangle extends ShapeManager {
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(String color, String production, int quantity, double sideA, double sideB, double sideC) {
        super(color, production, quantity);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getTotal() {
        return quantity + this.getPerimeter() + this.getArea();
    }
}
