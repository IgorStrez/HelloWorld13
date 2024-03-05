package Bobr.l30;


class Main1 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Привет из анонимного класса!");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("Пока из анонимного класса!");
            }
        };
        greeting.sayHello();

        greeting.sayGoodBye();
    }
}