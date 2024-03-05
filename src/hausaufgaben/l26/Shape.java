package hausaufgaben.l26;

public abstract class Shape {
    protected String color;
    protected String production;
    protected int quantity;

    public Shape(String color, String production, int quantity) {
        this.color = color;
        this.production = production;
        this.quantity = quantity;
    }

    // абстрактный метод для получения площади
    public abstract double getArea();

    // абстрактный метод для получения периметра
    public abstract double getPerimeter();

    // абстрактный метод для определения абстрактной красоты
    public abstract double getTotal();

    // общий метод для вывода информации о фигуре
    public void printInfo() {
        System.out.println("Цвет: " + color);
        System.out.println("Производство: " + production);
        System.out.println("Количество: " + quantity);
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Общее: " + getTotal());
    }
}

class Triangle extends Shape {
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


class Romb extends Shape {
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

class Rectangle extends Shape {
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
