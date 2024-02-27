package hausaufgaben.l31;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b, int c);
}

class Main30 {
    public static void main(String[] args) {
        Calculator add = new Calculator() {
            @Override
            public int operate(int a, int b, int c) {
                return a + b + c;
            }
        };
        int result = add.operate(2, 2,4);

        System.out.println("2 + 2 + 4 = " + result);

        Calculator sub = new Calculator() {
            @Override
            public int operate(int a, int b, int c) {
                return a + b - c;
            }
        };
        int result2 = sub.operate(2, 2, 4);

        System.out.println("2 + 2 - 4 = " + result2);

        Calculator multi = new Calculator() {
            @Override
            public int operate(int a, int b, int c) {
                return a * b * c;
            }
        };
        int result3 = multi.operate(2, 2, 4);

        System.out.println("2 * 2 * 4 = " + result3);
    }
}

class Main {
    public static void main(String[] args) {
        Calculator add = (a, b, c) -> a + b + c;
        Calculator subtract = (a, b, c) -> a + b - c;
        Calculator multiplay = (a, b, c) -> a * b * c;


        System.out.println("Сумма 5, 3 и 3 равна " + add.operate(5, 3, 3));
        System.out.println("Разность (5+3) и 4 равна " + subtract.operate(5, 3, 4));
        System.out.println("Умножение 5 на 3 и на 5 равно " + multiplay.operate(5, 3, 5));
    }
}