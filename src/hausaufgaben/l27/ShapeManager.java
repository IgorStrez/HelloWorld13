package hausaufgaben.l27;

public abstract class ShapeManager {
    protected String color;
    protected String production;
    protected int quantity;

    public ShapeManager(String color, String production, int quantity) {
        this.color = color;
        this.production = production;
        this.quantity = quantity;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract double getTotal();
    public void printInfo() {
        System.out.println("Цвет: " + color);
        System.out.println("Производство: " + production);
        System.out.println("Количество: " + quantity);
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Общее: " + getTotal());
    }
}