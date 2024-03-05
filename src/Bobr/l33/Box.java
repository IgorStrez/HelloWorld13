package Bobr.l33;

class Box<T1, T3, K> {
    private T1 data1;

    private T3 data3;
    private K meta;


    // Метод для установки значения поля
    public void set(T1 data1, T3 data3, K meta) {
        this.data1 = data1;
        this.data3 = data3;
        this.meta = meta;
    }

    // Метод для получения значения поля
    public T1 get1() {
        return data1;
    }

    public T3 get3() {
        return data3;
    }
    public K getK() {
        return meta;
    }

    // Метод для сравнения значения в Блоке
    public boolean isValueEqual(Object value) {
        if (data1 == null && data3 == null && meta == null) {
            return value == null;
        }
        return (data1 != null && data1.equals(value)) ||
                (data3 != null && data3.equals(value)) ||
                (meta != null && meta.equals(value));
    }

    // СтатМетод для сравнения двух Блоков
    public static <T1, T3, K> boolean isEqual(Box<T1, T3, K> box1, Box<T1, T3, K> box2) {
        if (box1 == null || box2 == null) {
            return false;
        }
        return box1.data1.equals(box2.data1) &&
                box1.data3.equals(box2.data3) &&
                box1.meta.equals(box2.meta);
    }
}