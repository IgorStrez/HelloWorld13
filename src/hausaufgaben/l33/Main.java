package hausaufgaben.l33;

public class Main {
    public static void main(String[] args) {
        // Создаем два Блока с разными типами данных
        Box<Integer, String, Double> box1 = new Box<>();
        Box<Integer, String, Double> box2 = new Box<>();

        // Устанавливаем значения для Блоков
        box1.set(13, "Привет", 3.14);
        box2.set(13, "Привет", 3.14);

        // Есть ли 13 в Блоке1
        boolean isValueEqual = box1.isValueEqual(13);
        System.out.println("Значение 13 в Блоке1 есть: " + isValueEqual);

        // Равны ли значения в двух Блоках
        boolean isEqual = Box.isEqual(box1, box2);
        System.out.println("Значения в Блоке1 и Блоке2 равны:" + isEqual);


    }
}
