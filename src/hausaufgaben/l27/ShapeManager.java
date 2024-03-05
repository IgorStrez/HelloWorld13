package hausaufgaben.l27;

public abstract class ShapeManager implements Shape{
    protected String color;
    protected String production;
    protected int quantity;

    public ShapeManager(String color, String production, int quantity) {
        this.color = color;
        this.production = production;
        this.quantity = quantity;
    }

    public void printInfo() {
        System.out.println("Цвет: " + color);
        System.out.println("Производство: " + production);
        System.out.println("Количество: " + quantity);
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Общее: " + getTotal());
    }
}